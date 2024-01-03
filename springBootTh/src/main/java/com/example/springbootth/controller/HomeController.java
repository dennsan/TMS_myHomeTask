package com.example.springbootth.controller;

import com.example.springbootth.entity.FilmEntity;
import com.example.springbootth.enumerated.Genre;
import com.example.springbootth.repository.FilmRepository;
import com.example.springbootth.service.impl.FilmServiceImpl;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;

import java.util.List;


@RequiredArgsConstructor

@Controller
@RequestMapping
public class HomeController {

    private final FilmRepository repository;
    private final FilmServiceImpl service;


    @GetMapping("/")
    public ModelAndView homePage(@ModelAttribute(name = "film") FilmEntity film) {
        ModelAndView modelAndView = new ModelAndView("home");
        modelAndView.addObject("genres", Genre.values());
        List<FilmEntity> allFilm = repository.findAll();
        modelAndView.addObject("films", allFilm);
        return modelAndView;
    }

    @PostMapping("/save")
    public String saveFilm(@ModelAttribute(name = "film") FilmEntity filmEntity) {
        repository.save(filmEntity);
        return "redirect:/";
    }

    @PostMapping("/update/{id}")
    public String updateRating(@PathVariable(name = "id", required = true) Integer id,
                               @RequestParam(name = "newRating", required = false) Double rating) {
        service.updateRating(id, rating);
        return "redirect:/";
    }
}
