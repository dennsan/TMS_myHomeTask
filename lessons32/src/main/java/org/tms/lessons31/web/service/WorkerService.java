package org.tms.lessons31.web.service;

import org.tms.lessons31.web.domain.Worker;

import java.util.List;

public interface WorkerService {
    List<Worker> getWorkers();
    void addWorker(Worker worker);
}
