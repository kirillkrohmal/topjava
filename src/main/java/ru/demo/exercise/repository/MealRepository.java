package ru.demo.exercise.repository;

import org.springframework.stereotype.Repository;
import ru.demo.exercise.models.Meal;

import java.util.List;


@Repository
public interface MealRepository {
    Meal save(Meal meal);

    Meal update(Meal meal);

    Meal get(int id);

    List<Meal> getAll();

    void delete(int id);
}
