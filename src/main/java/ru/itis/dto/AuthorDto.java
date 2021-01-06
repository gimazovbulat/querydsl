package ru.itis.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.bson.types.ObjectId;


@Data
@AllArgsConstructor
@NoArgsConstructor
public class AuthorDto {
    private ObjectId id;
    private String firstName;
    private String lastName;
}
