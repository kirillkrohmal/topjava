package ru.demo.exercise.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import ru.demo.exercise.models.Meal;

import java.util.List;
import java.util.Optional;


@Repository
public interface MealRepositoryJpa extends JpaRepository<Meal, Integer> {

    Meal getById(int id);


    @Override
    <S extends Meal> List<S> save(Iterable<S> entities);


    @Override
    void deleteAll();
}
