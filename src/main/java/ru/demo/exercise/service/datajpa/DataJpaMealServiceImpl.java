package ru.demo.exercise.service.datajpa;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import ru.demo.exercise.models.Meal;
import ru.demo.exercise.repository.datajpa.DataJpaMealRepository;
import ru.demo.exercise.service.MealService;


import java.util.List;

@Service
public class DataJpaMealServiceImpl implements MealService {

    @Autowired
    DataJpaMealRepository dataJpaMealRepository;

    @Override
    public Meal save(Meal meal) {
        return dataJpaMealRepository.save(meal);
    }

    @Override
    public Meal get(int id) {
        return dataJpaMealRepository.get(id);
    }

    @Override
    public List<Meal> getAll() {
        return dataJpaMealRepository.getAll();
    }

    @Override
    public void delete(int id) {
        dataJpaMealRepository.delete(id);
    }

    @Override
    public void update(Meal meal) {
        dataJpaMealRepository.update(meal);
    }
}
