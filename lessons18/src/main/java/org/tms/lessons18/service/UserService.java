package org.tms.lessons18.service;

import org.tms.lessons18.User;

import java.sql.SQLException;
import java.util.List;

public interface UserService {
    void save(User user);

    List<User> printInfo() throws SQLException;

}
