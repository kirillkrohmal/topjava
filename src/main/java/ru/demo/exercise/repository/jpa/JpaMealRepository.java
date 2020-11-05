package ru.demo.exercise.repository.jpa;


import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;
import ru.demo.exercise.models.Meal;
import ru.demo.exercise.repository.MealRepository;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import java.util.List;

@Repository
@Transactional(readOnly = true)
public class JpaMealRepository implements MealRepository {

    @PersistenceContext
    EntityManager entityManager;

    @Override
    public Meal save(Meal meal) {
        return entityManager.merge(meal);
    }

    @Override
    public Meal update(Meal meal) {
        return null;
    }

    @Override
    public Meal get(int id) {
        return entityManager.find(Meal.class, id);
    }

    @Override
    public List<Meal> getAll() {
        return entityManager.createNamedQuery(Meal.ALL_SORTED, Meal.class).getResultList();
    }

    @Override
    public void delete(int id) {
        Meal meal = entityManager.getReference(Meal.class, id);

        entityManager.remove(meal);
    }
}
