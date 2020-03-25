package ru.demo.exercise.repository.jpa;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;
import ru.demo.exercise.models.Meal;
import ru.demo.exercise.repository.MealRepository;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import java.util.List;



public class JpaMealRepository implements MealRepository {

    @PersistenceContext
    EntityManager entityManager;

    @Override
    @Transactional
    public Meal save(Meal meal) {
        if (meal.isNew()) {
            entityManager.persist(meal);
        } else {
            entityManager.merge(meal);
        }
        return meal;
    }

    @Override
    public Meal update(Meal meal) {
        return entityManager.merge(meal);
    }

    @Override
    public Meal get(int id) {
        return entityManager.find(Meal.class, id);
    }

    @Override
    public List<Meal> getAll() {
        return entityManager.createQuery(" FROM meals", Meal.class).getResultList();
    }

    @Override
    @Transactional
    public void delete(int id) {
        Meal ref = entityManager.getReference(Meal.class, id);
        entityManager.remove(ref);

    }
}
