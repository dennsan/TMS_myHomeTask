package com.tms.lessons41.repository;


import com.tms.lessons41.domain.FilmTitle;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;

import java.util.List;

public interface FilmRepository extends JpaRepository<FilmEntity, Integer>, JpaSpecificationExecutor<FilmEntity> {
    List<FilmTitle> findAllBy();
}
