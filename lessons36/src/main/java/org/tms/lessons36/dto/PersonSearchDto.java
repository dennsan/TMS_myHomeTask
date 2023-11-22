package org.tms.lessons36.dto;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.tms.lessons36.enumerated.Role;
import org.tms.lessons36.enumerated.Status;

import java.time.LocalDate;
import java.util.Date;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder

public class PersonSearchDto {
    private String name;
    private LocalDate from;
    private LocalDate to;
    private Role role;
    private Status status;
}
