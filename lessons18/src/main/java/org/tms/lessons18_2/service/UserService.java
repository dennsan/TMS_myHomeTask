package org.tms.lessons18_2.service;

import org.tms.lessons18_2.User;

import java.sql.SQLException;
import java.util.List;

public interface UserService {
    void save(User user);

    List<User> printInfo() throws SQLException;

    void delete (Integer id);

}
