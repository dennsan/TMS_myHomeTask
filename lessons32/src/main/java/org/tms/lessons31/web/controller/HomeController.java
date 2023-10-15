package org.tms.lessons31.web.controller;

import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.validation.FieldError;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;
import org.tms.lessons31.web.domain.Worker;
import org.tms.lessons31.web.exception.WorkerException;
import org.tms.lessons31.web.service.WorkerService;

import javax.validation.Valid;
import java.util.List;

@Controller
@RequestMapping("/home")
public class HomeController {

    private WorkerService workerService;

    public HomeController(WorkerService workerService) {
        this.workerService = workerService;
    }

    @GetMapping
    public ModelAndView homePage() {
        ModelAndView modelAndView = new ModelAndView("home");

        modelAndView.addObject("workers", workerService.getWorkers());
        return modelAndView;
    }

    @PostMapping
    public ModelAndView addWorker(@Valid Worker worker, BindingResult result) {

        ModelAndView modelAndView = new ModelAndView("home");

        if (result.hasFieldErrors()) {
            result.getFieldErrors()
                    .forEach(fieldError -> {
                        String field = fieldError.getField();
                        String defaultMessage = fieldError.getDefaultMessage();
                        modelAndView.addObject(field + "Error", defaultMessage);
                    });
        }
        if (!result.hasFieldErrors()) {
            workerService.addWorker(worker);
        }

        modelAndView.addObject("workers", workerService.getWorkers());
        return modelAndView;
    }
}
