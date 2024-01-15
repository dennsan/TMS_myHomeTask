package com.tms.lessons43store.web;

import com.tms.lessons43store.dto.CarDto;
import com.tms.lessons43store.service.StoreService;
import io.swagger.v3.oas.annotations.OpenAPIDefinition;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.info.Info;
import io.swagger.v3.oas.annotations.info.License;
import io.swagger.v3.oas.annotations.media.Content;
import io.swagger.v3.oas.annotations.media.Schema;
import io.swagger.v3.oas.annotations.responses.ApiResponse;
import io.swagger.v3.oas.annotations.responses.ApiResponses;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RequiredArgsConstructor
@RestController
@RequestMapping("/store/")
@OpenAPIDefinition(
        info = @Info(
                title = "This is StoreController to processing a user request",
                description = "This controller allows you to create and view cars",
                version = "0.0.1",
                license = @License(name = "My company")
        )
)
public class StoreController {
    private final StoreService service;

    @PostMapping
    public CarDto sava(@RequestBody CarDto dto){
        return service.save(dto);
    }
    @GetMapping
    public List<CarDto> getAll(){
        return service.getAll();
    }
    @PostMapping("/{id}")
    @Operation(
            tags = "Find",
            description = "This method allows you to search for a car by ID",
            summary = "Find car by id",
            responses = {
                    @ApiResponse(responseCode = "200",
                    description = "Car found",
                    content = @Content(
                            mediaType = "application/json",
                            schema = @Schema(implementation = CarDto.class)
                    )),
                    @ApiResponse(responseCode = "400",
                            description = "Car id not found",
                            content = @Content(
                                    mediaType = "application/json"
                            )
                            )
            }
    )
    public CarDto findById(@PathVariable(name = "id") Integer id){
        return service.findById(id);
    }
}
