package org.tms.lessons31.web.domain;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;

@Data
@NoArgsConstructor
@AllArgsConstructor

public class Worker {
@NotNull(message = "Please fill field")
@NotBlank(message = "Please fill field")
    private String name;
@NotBlank(message = "Please fill field")
@NotNull(message = "Please fill field")
    private String major;
}
