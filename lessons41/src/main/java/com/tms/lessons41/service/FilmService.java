package com.tms.lessons41.service;

import com.tms.lessons41.domain.FilmTitle;
import com.tms.lessons41.dto.FilmSearchDto;
import com.tms.lessons41.repository.FilmEntity;

import java.util.List;

public interface FilmService {

    List<FilmEntity> findByCriteria(FilmSearchDto dto);

    List<FilmTitle> findAllTitle();
}
