package ru.demo.exercise.service;

import org.springframework.stereotype.Service;
import ru.demo.exercise.models.Meal;

import java.util.List;


@Service
public interface MealService {
    Meal save(Meal meal);

    List<Meal> get();

    void delete(Meal meal);

    void update(int id, Meal meal);

}
