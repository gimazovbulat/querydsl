package ru.itis.repositories;

import com.querydsl.core.types.dsl.StringExpression;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.querydsl.QuerydslPredicateExecutor;
import org.springframework.data.querydsl.binding.QuerydslBinderCustomizer;
import org.springframework.data.querydsl.binding.QuerydslBindings;
import ru.itis.models.Book;
import ru.itis.models.QBook;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

public interface BookRepository extends MongoRepository<Book, String>, QuerydslPredicateExecutor<Book>,
        QuerydslBinderCustomizer<QBook> {

    @Override
    default void customize(QuerydslBindings bindings, QBook root) {
        bindings.bind(root.author.firstName).as("author.firstName")
                .first(StringExpression::containsIgnoreCase);

        bindings.bind(root.author.lastName).as("author.lastName")
                .first(StringExpression::containsIgnoreCase);

    }
}

