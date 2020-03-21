package ru.demo.exercise.repository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import ru.demo.exercise.models.Meal;

import java.util.List;

@Repository
public class JpaMealRepository {

    private MealRepositoryJpa mealRepositoryJpa;

    @Autowired
    public void setMealRepositoryJpa(MealRepositoryJpa mealRepositoryJpa) {
        this.mealRepositoryJpa = mealRepositoryJpa;
    }

    public Meal save(Meal meal) {
        return mealRepositoryJpa.save(meal);
    };

    public Meal update(Meal meal) {
        return mealRepositoryJpa.save(meal);
    };

    public Meal get(int id) {
        return mealRepositoryJpa.getOne(id);
    };

    public List<Meal> getAll() {
        return mealRepositoryJpa.findAll();
    };

    public void delete(int id) {
        mealRepositoryJpa.deleteById(id);
    };

}
