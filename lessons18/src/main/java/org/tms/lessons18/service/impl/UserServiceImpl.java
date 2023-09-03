package org.tms.lessons18.service.impl;

import org.tms.lessons18.User;
import org.tms.lessons18.config.ConfigConnection;
import org.tms.lessons18.service.UserService;

import java.sql.*;

public class UserServiceImpl implements UserService {

    Connection connection = ConfigConnection.getConnection("students", "postgres", "root1234");

    @Override
    public void save(User user) {

        PreparedStatement preparedStatement = null;
        try {
            preparedStatement = connection.prepareStatement("insert into student (name_student, sex, birthday) VALUES (?,?,?)");
            preparedStatement.setString(1, user.getName());
            preparedStatement.setString(2, user.getSex());
            preparedStatement.setString(3, user.getDate());
            preparedStatement.execute();
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }

    }

    @Override
    public void printInfo() {

        try {
            Statement statement = connection.createStatement();
            ResultSet resultSet = statement.executeQuery("select * from student");
            boolean next = resultSet.next();
            while (next) {
                int id = resultSet.getInt(1);
                String name = resultSet.getString(2);
                String sex = resultSet.getString(3);
                String date = resultSet.getString(4);
                System.out.println(id + " " + name + " " + sex + " " + date);
                next = resultSet.next();
            }
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }

}
