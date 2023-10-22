package org.tms.lessons33.web.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;
import org.tms.lessons33.web.domain.Worker;
import org.tms.lessons33.web.service.WorkerService;

import javax.validation.Valid;
import java.util.Collection;
import java.util.Map;

@Controller
@RequestMapping("/home")
public class HomeController {

    private WorkerService workerService;

    public HomeController(WorkerService workerService) {
        this.workerService = workerService;
    }

    @GetMapping
    public ModelAndView homePage(@ModelAttribute(name = "worker") Worker worker) {

        ModelAndView modelAndView = new ModelAndView("home");
        modelAndView.addObject("workers", workerService.getWorkers());
        return modelAndView;
    }

    @PostMapping
    public ModelAndView addWorker(@ModelAttribute(name = "worker") @Valid Worker worker, BindingResult result) {

        ModelAndView modelAndView = new ModelAndView("home");

        if (!result.hasFieldErrors()) {

            workerService.addWorker(worker);
            modelAndView.addObject(new Worker());

        }

        modelAndView.addObject("workers", workerService.getWorkers());
        return modelAndView;
    }
}
