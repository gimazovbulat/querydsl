package ru.itis.models;

import com.querydsl.core.annotations.QueryEntity;
import lombok.*;
import org.bson.types.ObjectId;
import org.springframework.data.annotation.Id;
import org.springframework.data.annotation.TypeAlias;
import org.springframework.data.mongodb.core.mapping.Document;


@Builder
@Getter
@Document
@Setter
@TypeAlias("author")
@NoArgsConstructor
@QueryEntity
@AllArgsConstructor
public class Author {
    @Id
    private ObjectId id;
    private String firstName;
    private String lastName;

    @Override
    public String toString() {
        return "Author{" +
                "firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                "} ";
    }
}
