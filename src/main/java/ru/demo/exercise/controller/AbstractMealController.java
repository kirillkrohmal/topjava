package ru.demo.exercise.controller;

import jdk.internal.jline.internal.Log;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ui.Model;
import ru.demo.exercise.models.Meal;
import ru.demo.exercise.service.MealService;

import java.util.List;

public abstract class AbstractMealController {
    private final Logger LOG = LoggerFactory.getLogger(getClass());

    @Autowired
    private MealService mealService;

    public Meal add(Meal meal) {
        LOG.info("return add method");
        return mealService.save(meal);
    }

    public void delete(Meal meal) {
        LOG.info("return delete method");
        mealService.delete(meal);
    }

    public void update(int id, Meal meal) {
        LOG.info("return update method");
        mealService.update(id, meal);
    }
}
