package ru.demo.exercise.jpa;


import org.springframework.data.jpa.repository.JpaRepository;
import ru.demo.exercise.models.Meal;


public interface ProxyRepository extends JpaRepository<Meal, Integer> {

}
