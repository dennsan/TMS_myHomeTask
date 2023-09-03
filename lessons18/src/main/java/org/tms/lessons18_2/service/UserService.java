package org.tms.lessons18_2.service;

import org.tms.lessons18_2.User;

public interface UserService {
    void save(User user);

    void printInfo();

    void delete (Integer id);

}
