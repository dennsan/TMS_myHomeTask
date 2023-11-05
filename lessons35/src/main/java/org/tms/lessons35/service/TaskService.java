package org.tms.lessons35.service;

import org.tms.lessons35.entity.TaskEntity;
import org.tms.lessons35.entity.UserEntity;
import org.tms.lessons35.enumerated.Status;

public interface TaskService {
    public void createTask(TaskEntity task, UserEntity user);
    public void updateTask(TaskEntity task, Status status);
    public void findById(int id);
    public void findByUser(String username);
}
