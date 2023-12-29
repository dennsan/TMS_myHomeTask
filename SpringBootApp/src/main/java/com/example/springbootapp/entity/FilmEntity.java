package com.example.springbootapp.entity;


import com.example.springbootapp.enumerated.Genre;
import jakarta.persistence.*;
import lombok.*;

import java.util.List;


@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Builder
@Entity
@Table(name = "films")

public class FilmEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    private String title;
    @Enumerated(EnumType.STRING)
    private Genre genre;
    private Integer age;
    private double rating;


}
