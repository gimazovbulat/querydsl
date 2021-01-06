package ru.itis.mappers;

import org.mapstruct.Mapper;
import ru.itis.dto.AuthorDto;
import ru.itis.models.Author;

@Mapper(componentModel = "spring")
public interface AuthorMapper {
    AuthorDto toDto(Author author);

    Author fromDto(AuthorDto authorDto);
}
