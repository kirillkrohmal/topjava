package ru.demo.exercise.repository.datajpa;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import ru.demo.exercise.models.Meal;
import ru.demo.exercise.repository.MealRepository;

import java.util.List;

@Repository
public class DataJpaMealRepository implements MealRepository {

    @Autowired
    private ProxyRepository proxyRepository;

    public Meal save(Meal meal) {
        return proxyRepository.save(meal);
    };

    public Meal update(Meal meal) {
        return proxyRepository.save(meal);
    };

    public Meal get(int id) {
        return proxyRepository.getOne(id);
    };

    public List<Meal> getAll() {
        return proxyRepository.findAll();
    };

    public void delete(int id) {
        proxyRepository.deleteById(id);
    };
}
