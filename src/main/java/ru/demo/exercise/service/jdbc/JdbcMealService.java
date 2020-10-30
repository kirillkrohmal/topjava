package ru.demo.exercise.service.jdbc;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import ru.demo.exercise.models.Meal;
import ru.demo.exercise.service.MealService;

import java.util.List;


@Service
public class JdbcMealService implements MealService {


    public Meal save(Meal meal) {
        //meal = mealRepository.save(meal);
        return meal;
    }

    public Meal get(int id) {
        return null;
    }

    public List<Meal> getAll() {
        return null;
    }

    public void delete(int id) {

    }

    public void update(Meal meal) {

    }
}
