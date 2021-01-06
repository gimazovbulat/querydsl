package ru.itis.repositories;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.querydsl.QuerydslPredicateExecutor;
import org.springframework.data.querydsl.binding.QuerydslBinderCustomizer;
import org.springframework.data.querydsl.binding.QuerydslBindings;
import ru.itis.models.Author;
import ru.itis.models.QAuthor;

public interface AuthorRepository extends MongoRepository<Author, String>, QuerydslPredicateExecutor<Author>,
        QuerydslBinderCustomizer<QAuthor> {

    @Override
    default void customize(QuerydslBindings bindings, QAuthor root) {

    }
}

