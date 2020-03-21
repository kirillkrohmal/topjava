package ru.demo.exercise.repository;

import ru.demo.exercise.models.Meal;

import java.util.List;

public interface MealRepository {
    Meal save(Meal meal);

    Meal update(Meal meal);

    Meal get(int id);

    List<Meal> getAll();

    void delete(int id);

}
