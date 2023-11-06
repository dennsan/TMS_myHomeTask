package org.tms.lessons35.service;

import org.tms.lessons35.enumerated.Status;

public interface ActiveTaskService {
    public void findByUser(Status status);
}
