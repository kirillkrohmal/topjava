package ru.demo.exercise.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import ru.demo.exercise.models.Meal;
import ru.demo.exercise.repository.jdbc.JdbcMealRepository;

import java.util.List;

@Service
public class JdbcMealServiceImpl implements MealService {

    @Autowired
    JdbcMealRepository jdbcMealRepository;

    @Override
    public Meal save(Meal meal) {
        return null;
    }

    @Override
    public Meal get(int id) {
        return null;
    }

    @Override
    public List<Meal> getAll() {
        return null;
    }

    @Override
    public void delete(int id) {

    }

    @Override
    public void update(Meal meal) {

    }
}
