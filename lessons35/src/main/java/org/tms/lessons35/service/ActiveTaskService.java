package org.tms.lessons35.service;

import org.tms.lessons35.entity.UserEntity;
import org.tms.lessons35.enumerated.Status;

import java.util.List;

public interface ActiveTaskService {
    public List<UserEntity> findByUser(Status status);
}
