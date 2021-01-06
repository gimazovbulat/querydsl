package ru.itis.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.bson.types.ObjectId;

import java.time.LocalDate;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class BookDto {
    private ObjectId id;
    private String name;
    private String genre;
    private LocalDate publishDate;
    private AuthorDto author;
}
