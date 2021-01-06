package ru.itis.mappers;

import org.mapstruct.Mapper;
import ru.itis.dto.BookDto;
import ru.itis.models.Book;

@Mapper(componentModel = "spring", uses = AuthorMapper.class)
public interface BookMapper {
    Book fromDto(BookDto bookDto);

    BookDto toDto(Book book);
}
