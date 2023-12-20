package org.tms.lessons36.service;

import org.tms.lessons36.entity.TaskEntity;
import org.tms.lessons36.entity.UserEntity;
import org.tms.lessons36.enumerated.Status;

public interface TaskService {
    void createTask(TaskEntity task);

    void updateTask(TaskEntity task, Status status);
}
