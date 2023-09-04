package org.tms.lessons18_2.service.impl;

import org.tms.lessons18_2.User;
import org.tms.lessons18_2.config.ConfigConnection;
import org.tms.lessons18_2.service.UserService;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

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
    public List<User> printInfo() throws SQLException {

        Statement statement = connection.createStatement();
        ResultSet resultSet = statement.executeQuery("select student.id, name_student, sex, birthday,name_city from student " +
                "left join city C on student.city_id = C.id");
        return createListUser(resultSet);
    }

    private List<User> createListUser(ResultSet resultSet) throws SQLException {

        List<User> userList = new ArrayList<>();

        while (resultSet.next()) {

            int id = resultSet.getInt(1);
            String name = resultSet.getString(2);
            String sex = resultSet.getString(3);
            String date = resultSet.getString(4);
            String city = resultSet.getString(5);

            User user = new User(id, name, sex, date, city);
            userList.add(user);
        }
        return userList;
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
