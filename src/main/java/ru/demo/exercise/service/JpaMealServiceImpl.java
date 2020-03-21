package ru.demo.exercise.service;

import org.springframework.beans.factory.annotation.Autowired;
import ru.demo.exercise.models.Meal;
import ru.demo.exercise.repository.jpa.JpaMealRepository;

import java.util.List;

public class JpaMealServiceImpl implements MealService {

    @Autowired
    JpaMealRepository jpaMealRepository;

    @Override
    public Meal save(Meal meal) {
        return jpaMealRepository.save(meal);
    }

    @Override
    public Meal get(int id) {
        return jpaMealRepository.get(id);
    }

    @Override
    public List<Meal> getAll() {
        return jpaMealRepository.getAll();
    }

    @Override
    public void delete(int id) {
        jpaMealRepository.delete(id);
    }

    @Override
    public void update(Meal meal) {

    }
}
