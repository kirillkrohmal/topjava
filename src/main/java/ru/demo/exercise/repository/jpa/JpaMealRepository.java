package ru.demo.exercise.repository.jpa;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import ru.demo.exercise.models.Meal;
import ru.demo.exercise.repository.MealRepository;

import javax.persistence.EntityManager;
import java.util.List;


@Repository
public class JpaMealRepository implements MealRepository {

    @Autowired
    EntityManager entityManager;

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
