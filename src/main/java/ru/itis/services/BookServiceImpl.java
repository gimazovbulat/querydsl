package ru.itis.services;

import com.querydsl.core.types.Predicate;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import ru.itis.dto.AuthorDto;
import ru.itis.dto.BookDto;
import ru.itis.mappers.BookMapper;
import ru.itis.repositories.BookRepository;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.StreamSupport;

@RequiredArgsConstructor
@Service
public class BookServiceImpl implements BookService{
    private final BookRepository bookRepository;
    private final BookMapper bookMapper;

    @Override
    public List<BookDto> findAll(Predicate predicate) {
        return StreamSupport.stream(bookRepository.findAll(predicate).spliterator(), true)
                .map(bookMapper::toDto)
                .collect(Collectors.toList());
    }
}
