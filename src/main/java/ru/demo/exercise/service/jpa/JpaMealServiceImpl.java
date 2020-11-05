package ru.demo.exercise.service.jpa;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import ru.demo.exercise.models.Meal;
import ru.demo.exercise.repository.datajpa.DataJpaMealRepository;
import ru.demo.exercise.repository.jpa.JpaMealRepository;
import ru.demo.exercise.service.MealService;

import java.util.List;

@Service
public class JpaMealServiceImpl implements MealService {

    @Autowired
    JpaMealRepository JpaMealRepository;

    @Override
    public Meal save(Meal meal) {
        return JpaMealRepository.save(meal);
    }

    @Override
    public Meal get(int id) {
        return JpaMealRepository.get(id);
    }

    @Override
    public List<Meal> getAll() {
        return JpaMealRepository.getAll();
    }

    @Override
    public void delete(int id) {
        JpaMealRepository.delete(id);
    }

    @Override
    public void update(Meal meal) {
        JpaMealRepository.update(meal);
    }
}
