package org.tms.lessons36.service;

import org.tms.lessons36.entity.UserEntity;

public interface UserService {
    void saveUser(UserEntity user);
    void updateUser(UserEntity user);
    void deleteById(int id);
    void deleteAllUser();
    void findById(int id);
}
