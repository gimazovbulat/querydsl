package ru.itis.services;

import com.querydsl.core.types.Predicate;
import ru.itis.dto.AuthorDto;

import java.util.List;

public interface AuthorService {
    List<AuthorDto> findAll(Predicate predicate);
}
