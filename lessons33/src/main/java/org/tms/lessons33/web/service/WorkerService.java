package org.tms.lessons33.web.service;

import org.tms.lessons33.web.domain.Worker;

import java.util.List;

public interface WorkerService {
    List<Worker> getWorkers();
    void addWorker(Worker worker);
}
