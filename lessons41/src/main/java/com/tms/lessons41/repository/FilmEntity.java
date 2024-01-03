package com.tms.lessons41.repository;

import com.tms.lessons41.enumerated.Genre;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor

@Entity
@Table(name = "films")

public class FilmEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    private Integer id;
    private String title;
    @Enumerated(EnumType.STRING)
    private Genre genre;
    private Integer age;
    private Double rating;
}
