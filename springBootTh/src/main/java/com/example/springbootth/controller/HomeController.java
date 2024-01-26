package com.example.springbootth.controller;

import com.example.springbootth.dto.FilmDto;
import com.example.springbootth.entity.FilmEntity;
import com.example.springbootth.enumerated.Genre;
import com.example.springbootth.service.impl.FilmServiceImpl;
import jakarta.validation.Valid;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;

import java.util.List;


@RequiredArgsConstructor

@Controller
@RequestMapping
public class HomeController {

    private final FilmServiceImpl service;

    @GetMapping("/")
    public ModelAndView homePage(@ModelAttribute(name = "film") FilmEntity film) {

        ModelAndView modelAndView = new ModelAndView("home");
        modelAndView.addObject("genres", Genre.values());
        List<FilmDto> all = service.getAll();
        modelAndView.addObject("films", all);
        return modelAndView;
    }

    @PostMapping("/save")
    public String saveFilm(@Valid FilmDto dto) {
        service.save(dto);
        return "redirect:/";
    }

    @PostMapping("/update/{id}")
    public String updateRating(@PathVariable(name = "id", required = true) Integer id,
                               @RequestParam(name = "newRating", required = false) Double rating) {
        service.updateRating(id, rating);
        return "redirect:/";
    }
}
