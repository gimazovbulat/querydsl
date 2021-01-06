package ru.itis.models;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.querydsl.core.annotations.QueryEntity;
import lombok.*;
import org.bson.types.ObjectId;
import org.springframework.data.annotation.Id;
import org.springframework.data.annotation.TypeAlias;
import org.springframework.data.mongodb.core.mapping.DBRef;
import org.springframework.data.mongodb.core.mapping.Document;

import java.time.LocalDate;

@Builder
@Getter
@Document
@Setter
@TypeAlias("book")
@NoArgsConstructor
@QueryEntity
@AllArgsConstructor
public class Book {
    @Id
    private ObjectId id;
    private String name;
    @DBRef
    private Author author;
    private String genre;
    @JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "yyyy-MM-dd")
    private LocalDate publishDate;

    @Override
    public String toString() {
        return "Book{" +
                "id='" + id + '\'' +
                "name='" + name + '\'' +
                ", genre=" + genre +
                ", author=" + author.getFirstName() +
                "} ";
    }
}
