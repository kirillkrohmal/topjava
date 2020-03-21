package ru.demo.exercise.repository.datajpa;


import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import ru.demo.exercise.models.Meal;

@Repository
public interface ProxyRepository extends JpaRepository<Meal, Integer> {

}
