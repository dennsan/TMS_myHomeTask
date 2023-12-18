package org.tms.lessons35.service;

import org.tms.lessons35.entity.UserEntity;

public interface UserService {
    public void saveUser(UserEntity user);
    public void updateUser(UserEntity user);
    public void deleteById(int id);
    public void deleteAllUsers();
    public UserEntity findByID(int id);
}
