package com.tms.lessons41.dto;

import com.tms.lessons41.enumerated.Genre;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter


public class FilmSearchDto {
    private String title;
    private Genre genre;
    private Double from;
    private Double to;

}
