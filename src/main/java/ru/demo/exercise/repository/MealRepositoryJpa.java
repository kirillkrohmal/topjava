package ru.demo.exercise.repository;


import org.springframework.data.jpa.repository.JpaRepository;
import ru.demo.exercise.models.Meal;


public interface MealRepositoryJpa extends JpaRepository<Meal, Integer> {

}
