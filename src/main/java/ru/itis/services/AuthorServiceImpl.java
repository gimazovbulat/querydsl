package ru.itis.services;

import com.querydsl.core.types.Predicate;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import ru.itis.dto.AuthorDto;
import ru.itis.mappers.AuthorMapper;
import ru.itis.repositories.AuthorRepository;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.StreamSupport;

@RequiredArgsConstructor
@Service
public class AuthorServiceImpl implements AuthorService {
    private final AuthorRepository authorRepository;
    private final AuthorMapper authorMapper;

    @Override
    public List<AuthorDto> findAll(Predicate predicate) {
        return StreamSupport.stream(authorRepository.findAll(predicate).spliterator(), true)
                .map(authorMapper::toDto)
                .collect(Collectors.toList());
    }
}
