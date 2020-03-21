package ru.demo.exercise.controller;


import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import ru.demo.exercise.models.Meal;
import ru.demo.exercise.service.MealService;

@Controller
public abstract class AbstractMealController {
    private final Logger LOG = LoggerFactory.getLogger(getClass());

    @Autowired
    private MealService mealService;

    public Meal add(Meal meal) {
        LOG.info("return add method");
        return mealService.save(meal);
    }

    public void delete(int id) {
        LOG.info("return delete method");
        mealService.delete(id);
    }

    public void update(Meal meal) {
        LOG.info("return update method");
        mealService.update(meal);
    }
}
