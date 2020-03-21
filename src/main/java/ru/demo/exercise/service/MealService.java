package ru.demo.exercise.service;

import org.springframework.stereotype.Service;
import ru.demo.exercise.models.Meal;

import java.util.List;


@Service
public interface MealService {
    Meal save(Meal meal);

    Meal get(int id);

    List<Meal> getAll();

    void delete(int id);

    void update(Meal meal);

}
