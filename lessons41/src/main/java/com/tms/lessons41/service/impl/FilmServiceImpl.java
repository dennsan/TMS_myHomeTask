package com.tms.lessons41.service.impl;

import com.tms.lessons41.domain.FilmTitle;
import com.tms.lessons41.dto.FilmSearchDto;
import com.tms.lessons41.enumerated.Genre;
import com.tms.lessons41.repository.FilmEntity;
import com.tms.lessons41.repository.FilmRepository;
import com.tms.lessons41.service.FilmService;
import jakarta.persistence.criteria.Predicate;
import lombok.RequiredArgsConstructor;
import org.springframework.data.jpa.domain.Specification;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@RequiredArgsConstructor
@Service

public class FilmServiceImpl implements FilmService {
    private final FilmRepository repository;

    @Override
    public List<FilmEntity> findByCriteria(FilmSearchDto dto) {
        Specification<FilmEntity> specification = createSpec(dto);
        return repository.findAll(specification);
    }

    @Override
    public List<FilmTitle> findAllTitle() {
        return repository.findAllBy();
    }

    private Specification<FilmEntity> createSpec(FilmSearchDto searchDto) {
        return (root, query, builder) -> {
            String title = searchDto.getTitle();
            Genre genre = searchDto.getGenre();
            Double from = searchDto.getFrom();
            Double to = searchDto.getTo();

            var predicates = new ArrayList<Predicate>();
            if (title != null && !title.isBlank()) {
                Predicate titleEq = builder.like(root.get("title"), "%" + title + "%");
                predicates.add(titleEq);
            }
            if (genre != null) {
                Predicate genreEq = builder.equal(root.get("genre"), genre);
                predicates.add(genreEq);
            }
            if (from != null) {
                Predicate ratingGe = builder.ge(root.get("rating"), from);
                predicates.add(ratingGe);
            }
            if (to != null) {
                Predicate ratingLe = builder.le(root.get("rating"), to);
                predicates.add(ratingLe);
            }
            Predicate[] array = predicates.toArray(Predicate[]::new);
            return builder.and(array);
        };
    }

}
