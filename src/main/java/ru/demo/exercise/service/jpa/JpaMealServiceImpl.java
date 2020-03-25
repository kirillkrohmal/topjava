package ru.demo.exercise.service.jpa;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import ru.demo.exercise.models.Meal;
import ru.demo.exercise.repository.jpa.JpaMealRepository;
import ru.demo.exercise.service.MealService;

import java.util.List;


public class JpaMealServiceImpl implements MealService {

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
