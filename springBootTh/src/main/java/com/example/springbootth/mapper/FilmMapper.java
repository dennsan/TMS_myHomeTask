package com.example.springbootth.mapper;

import com.example.springbootth.dto.FilmDto;
import com.example.springbootth.entity.FilmEntity;
import org.mapstruct.Mapper;

import java.util.List;

@Mapper(componentModel = "spring")
public interface FilmMapper {
    FilmDto toDto(FilmEntity entity);

    FilmEntity toEntity(FilmDto dto);

    List<FilmDto> toDtos(List<FilmEntity> entities);

}
