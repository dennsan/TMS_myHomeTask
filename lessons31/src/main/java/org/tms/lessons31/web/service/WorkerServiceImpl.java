package org.tms.lessons31.web.service;

import org.springframework.stereotype.Service;
import org.tms.lessons31.web.domain.Worker;
import org.tms.lessons31.web.exception.WorkerException;

@Service
public class WorkerServiceImpl implements WorkerService {
    @Override
    public void addWorker(Worker worker) {
        String name = worker.getName();
        String major = worker.getMajor();
        if (name == null || major == null) {
            throw new WorkerException(worker);
        }
        if (name.isBlank() || major.isBlank()) {
            throw new WorkerException(worker);
        }
    }
}
