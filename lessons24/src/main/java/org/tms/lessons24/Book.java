package org.tms.lessons24;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.UUID;

@Data
@NoArgsConstructor
@AllArgsConstructor

public class Book {

    private UUID Id;
    private String title;
    private String author;
    private String category;
}
