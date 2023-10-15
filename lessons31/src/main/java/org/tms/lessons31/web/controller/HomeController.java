package org.tms.lessons31.web.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.tms.lessons31.web.domain.Worker;
import org.tms.lessons31.web.exception.WorkerException;
import org.tms.lessons31.web.service.WorkerService;

@Controller
@RequestMapping("/home")
public class HomeController {

    private WorkerService workerService;

    public HomeController(WorkerService workerService) {
        this.workerService = workerService;
    }

    @GetMapping
    public String homePage() {
        return "home";
    }

    @PostMapping
    public String addWorker(Worker worker) {
        workerService.addWorker(worker);
        return "home";
    }

    @ExceptionHandler(WorkerException.class)
    public String getError() {
        return "error";
    }


}
