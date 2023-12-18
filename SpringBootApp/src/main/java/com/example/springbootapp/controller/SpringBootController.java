package com.example.springbootapp.controller;

import com.example.springbootapp.entity.FilmEntity;
import com.example.springbootapp.enumerated.Genre;
import com.example.springbootapp.service.FilmService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import java.util.List;

@RequiredArgsConstructor

@Controller
@RequestMapping
public class SpringBootController {
    public static final String HOME_PAGE = "home";

    private final FilmService service;

    @GetMapping("/")
    public ModelAndView homePage() {
        ModelAndView modelAndView = new ModelAndView(HOME_PAGE);
        modelAndView.addObject("genres", Genre.values());
        return modelAndView;
    }

    @PostMapping("/save")
    public String saveFilm(FilmEntity film) {
        service.save(film);
        return "redirect:/";
    }

    @GetMapping("/get")
    public ModelAndView getByID(@RequestParam(name = "id", required = false) Integer id) {
        ModelAndView modelAndView = new ModelAndView("films");

        if (id == null) {
            modelAndView.addObject("films", service.findAll());
        } else {
            service.findById(id).ifPresent(film -> modelAndView.addObject("film", film));
        }

        return modelAndView;
    }

    @GetMapping("/get_title")
    public ModelAndView getByTitle(@RequestParam(name = "title", required = true) String title) {
        ModelAndView modelAndView = new ModelAndView("films");
        var byTitle = service.findByTitle(title);
        modelAndView.addObject("film", byTitle);
        return modelAndView;
    }
}
