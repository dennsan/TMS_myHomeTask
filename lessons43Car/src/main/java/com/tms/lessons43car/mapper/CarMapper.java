package com.tms.lessons43car.mapper;

import com.tms.lessons43car.dto.CarDto;
import com.tms.lessons43car.model.CarEntity;
import org.mapstruct.Mapper;

import java.util.List;

@Mapper(componentModel = "spring")
public interface CarMapper {

    CarEntity toEntity(CarDto dto);
    CarDto toDto(CarEntity entity);
    List<CarDto> toDtos(List<CarEntity> entities);
}
