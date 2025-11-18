package edu.icet.model.entity;

import lombok.*;

@Setter
@Getter
@NoArgsConstructor
@AllArgsConstructor
@ToString

public class Book {

    private String id;
    private String isbn;
    private String name;
    private String description;
    private String category;
    private boolean status;

}
