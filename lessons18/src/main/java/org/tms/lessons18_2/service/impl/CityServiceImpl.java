package org.tms.lessons18_2.service.impl;

import org.tms.lessons18_2.City;
import org.tms.lessons18_2.config.ConfigConnection;
import org.tms.lessons18_2.service.CityService;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class CityServiceImpl implements CityService {

    Connection connection = ConfigConnection.getConnection("students", "postgres", "root1234");

    @Override
    public void addCity(City city) {
        PreparedStatement preparedStatement = null;
        try {
            preparedStatement = connection.prepareStatement("insert into city (name_city) VALUES (?)");
            preparedStatement.setString(1, city.getName());
            preparedStatement.execute();
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }

    }

    @Override
    public void deleteCity(Integer idCity) {
        PreparedStatement preparedStatement = null;
        try {
            preparedStatement = connection.prepareStatement("delete from city where id = (?)");
            preparedStatement.setInt(1, idCity);
            preparedStatement.execute();
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }
}
