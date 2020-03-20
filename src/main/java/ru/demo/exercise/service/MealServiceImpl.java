package ru.demo.exercise.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import ru.demo.exercise.models.Meal;
import ru.demo.exercise.repository.JpaMealRepository;

import java.util.List;

@Service
public class MealServiceImpl implements MealService {
    @Autowired
    JpaMealRepository jpaMealRepository;

    @Override
    public Meal save(Meal meal) {
        return jpaMealRepository.save(meal);
    }

    @Override
    public List<Meal> get() {
        return jpaMealRepository.getAll();
    }

    @Override
    public void delete(Meal meal) {
        jpaMealRepository.delete(meal);
    }

    @Override
    public void update(int id, Meal meal) {
        jpaMealRepository.update(id, meal);
    }
}
