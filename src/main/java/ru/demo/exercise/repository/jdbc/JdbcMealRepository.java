package ru.demo.exercise.repository.jdbc;

import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;
import ru.demo.exercise.repository.MealRepository;
import ru.demo.exercise.models.Meal;

import java.util.List;

@Repository
public class JdbcMealRepository implements MealRepository {

    JdbcTemplate jdbcTemplate;

    @Override
    public Meal save(Meal meal) {
        return null;
    }

    @Override
    public Meal update(Meal meal) {
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
}
