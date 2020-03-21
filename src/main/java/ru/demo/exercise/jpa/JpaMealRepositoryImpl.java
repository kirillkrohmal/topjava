package ru.demo.exercise.jpa;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import ru.demo.exercise.jpa.ProxyRepository;
import ru.demo.exercise.models.Meal;
import ru.demo.exercise.repository.MealRepository;

import java.util.List;

@Repository
public class JpaMealRepositoryImpl implements MealRepository {

    private ProxyRepository proxyRepository;

    @Autowired
    public void setMealRepositoryJpa(ProxyRepository mealRepositoryJpa) {
        this.proxyRepository = mealRepositoryJpa;
    }

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
