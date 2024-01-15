package com.example.springbootth.validation;

import com.example.springbootth.dto.FilmDto;
import jakarta.validation.ConstraintValidator;
import jakarta.validation.ConstraintValidatorContext;
import org.apache.commons.lang3.StringUtils;

public class FilmTitleValidation implements ConstraintValidator<CheckTitleNameValidation, FilmDto> {

    @Override
    public boolean isValid(FilmDto film, ConstraintValidatorContext constraintValidatorContext) {

        String title = film.getTitle();

        String[] blackList = {"horor", "action", "drama"};

        if (StringUtils.containsAny("%" + title + "%", blackList)) {
            return false;
        }
        return true;
    }
}
