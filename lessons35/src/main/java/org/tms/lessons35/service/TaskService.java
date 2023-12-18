package org.tms.lessons35.service;

import org.tms.lessons35.entity.TaskEntity;
import org.tms.lessons35.entity.UserEntity;
import org.tms.lessons35.enumerated.Status;

import java.util.List;

public interface TaskService {
    public void createTask(TaskEntity task, UserEntity user);
    public void updateTask(TaskEntity task, Status status);
    public TaskEntity findById(int id);
    public List<UserEntity> findByUser(String username);
}
