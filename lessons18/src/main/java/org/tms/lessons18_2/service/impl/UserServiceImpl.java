package org.tms.lessons18_2.service.impl;

import org.tms.lessons18_2.User;
import org.tms.lessons18_2.config.ConfigConnection;
import org.tms.lessons18_2.service.UserService;

import java.sql.*;

public class UserServiceImpl implements UserService {

    Connection connection = ConfigConnection.getConnection("students", "postgres", "root1234");

    @Override
    public void save(User user) {

        PreparedStatement preparedStatement = null;
        try {
            preparedStatement = connection.prepareStatement("insert into student (name_student, sex, birthday, city_id) VALUES (?,?,?,?)");
            preparedStatement.setString(1, user.getName());
            preparedStatement.setString(2, user.getSex());
            preparedStatement.setString(3, user.getDate());
            preparedStatement.setInt(4, user.getCityId());
            preparedStatement.execute();
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }

    }

    @Override
    public void printInfo() {

        try {
            Statement statement = connection.createStatement();
            ResultSet resultSet = statement.executeQuery("select student.id, name_student, sex, birthday,name_city from student " +
                    "join city C on student.city_id = C.id order by student.id");
            boolean next = resultSet.next();
            while (next) {
                int id = resultSet.getInt(1);
                String name = resultSet.getString(2);
                String sex = resultSet.getString(3);
                String date = resultSet.getString(4);
                String city = resultSet.getString(5);
                System.out.println(id + " " + name + " " + sex + " " + date + " " + city);
                next = resultSet.next();
            }
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }

    @Override
    public void delete(Integer id) {
        PreparedStatement preparedStatement = null;
        try {
            preparedStatement = connection.prepareStatement("delete from student where id = (?)");
            preparedStatement.setInt(1, id);
            preparedStatement.execute();
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }
}
