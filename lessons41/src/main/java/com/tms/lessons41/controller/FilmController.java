package com.tms.lessons41.controller;

import com.tms.lessons41.domain.FilmTitle;
import com.tms.lessons41.dto.FilmSearchDto;
import com.tms.lessons41.enumerated.Genre;
import com.tms.lessons41.repository.FilmEntity;
import com.tms.lessons41.repository.FilmRepository;
import com.tms.lessons41.service.impl.FilmServiceImpl;
import lombok.RequiredArgsConstructor;
import org.springframework.boot.Banner;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;

import java.util.List;

@RequiredArgsConstructor
@Controller
@RequestMapping

public class FilmController {
    private final FilmRepository repository;
    private final FilmServiceImpl service;
    public static final String HOME_PAGE = "home";

    @GetMapping("/")
    public ModelAndView loadStartPage(@ModelAttribute(name = "searchDto") FilmSearchDto searchDto) {
        ModelAndView modelAndView = new ModelAndView(HOME_PAGE);
        List<FilmEntity> films = repository.findAll();
        modelAndView.addObject("genres", Genre.values());
        modelAndView.addObject("films", films);

        return modelAndView;
    }

    public ModelAndView saveFilm() {
        ModelAndView modelAndView = new ModelAndView(HOME_PAGE);
        return modelAndView;
    }

    @PostMapping("/findFilm")
    public ModelAndView findFilm(FilmSearchDto dto) {
        ModelAndView modelAndView = new ModelAndView(HOME_PAGE);
        List<FilmEntity> filmList = service.findByCriteria(dto);
        modelAndView.addObject("searchDto", new FilmSearchDto());
        modelAndView.addObject("movies", filmList);
        modelAndView.addObject("genres", Genre.values());
        List<FilmEntity> films = repository.findAll();
        modelAndView.addObject("films", films);
        return modelAndView;
    }

    @PostMapping("/findAll")
    public ModelAndView findOnlyTitle(){
        List<FilmTitle> allTitle = service.findAllTitle();
        ModelAndView modelAndView = new ModelAndView(HOME_PAGE);
        modelAndView.addObject("searchDto", new FilmSearchDto());
        modelAndView.addObject("genres", Genre.values());
        modelAndView.addObject("proj", allTitle);
        return modelAndView;
    }
}
