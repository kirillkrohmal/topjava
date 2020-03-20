package ru.demo.exercise.repository;


import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import ru.demo.exercise.models.Meal;




public interface MealRepositoryJpa extends JpaRepository<Meal, Integer> {

}
