package ru.demo.exercise.repository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import ru.demo.exercise.models.Meal;

import java.util.List;

@Repository
public class JpaMealRepository {

    @Autowired
    private MealRepositoryJpa mealRepositoryJpa;

    public Meal save(Meal meal) {
        return mealRepositoryJpa.save(meal);
    };

    public Meal update(int id, Meal meal) {
        return mealRepositoryJpa.save(meal);
    };

    public Meal get(int id) {
        return mealRepositoryJpa.getById(id);
    };

    public List<Meal> getAll() {
        return mealRepositoryJpa.findAll();
    };

    public void delete(int id) {
        mealRepositoryJpa.deleteById(id);
    };

}
