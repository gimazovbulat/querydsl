package ru.itis.services;

import com.querydsl.core.types.Predicate;
import ru.itis.dto.BookDto;

import java.util.List;

public interface BookService {
    List<BookDto> findAll(Predicate predicate);
}
