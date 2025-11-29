package edu.icet.model.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.*;

@Setter
@Getter
@NoArgsConstructor
@AllArgsConstructor
@ToString


@Entity
public class Book {

    @Id
    private String id;
    private String isbn;
    private String name;
    private String description;
    private String category;
    private boolean status;

}
