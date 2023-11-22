package org.tms.lessons36.service;

import org.tms.lessons36.enumerated.Status;

public interface ActiveTaskService {
    void findByUser(Status status);
}
