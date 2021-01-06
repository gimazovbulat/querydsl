package ru.itis.controllers;

import com.querydsl.core.types.Predicate;
import lombok.RequiredArgsConstructor;
import org.springframework.data.querydsl.binding.QuerydslPredicate;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import ru.itis.dto.AuthorDto;
import ru.itis.dto.BookDto;
import ru.itis.models.Author;
import ru.itis.models.Book;
import ru.itis.repositories.AuthorRepository;
import ru.itis.repositories.BookRepository;
import ru.itis.services.AuthorService;
import ru.itis.services.BookService;

import java.util.List;

@RequiredArgsConstructor
@RestController
public class TrashController {
    private final AuthorService authorService;
    private final BookService bookService;

    @GetMapping("/authors")
    List<AuthorDto> findAuthors(@QuerydslPredicate(root = Author.class,
            bindings = AuthorRepository.class) Predicate predicate) {
        return authorService.findAll(predicate);
    }

    @GetMapping("/books")
    List<BookDto> findBooks(@QuerydslPredicate(root = Book.class,
            bindings = BookRepository.class) Predicate predicate) {
        return bookService.findAll(predicate);
    }
}
