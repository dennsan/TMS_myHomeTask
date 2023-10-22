package org.tms.lessons33.web.service;

import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.tms.lessons33.web.domain.Worker;

import java.util.ArrayList;
import java.util.List;

@Service
public class WorkerServiceImpl implements WorkerService {
    @Override
    public List<Worker> getWorkers() {
        return workers;
    }

    List<Worker> workers = new ArrayList<>();

    @Override
    public void addWorker(Worker worker) {
        workers.add(worker);
    }
}
