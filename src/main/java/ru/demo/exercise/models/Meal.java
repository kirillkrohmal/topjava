package ru.demo.exercise.models;



import ru.demo.exercise.mealconverter.MealConverter;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import java.sql.Timestamp;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.Date;
import javax.persistence.*;


@Entity
@Table(name="meals")
public class Meal {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "id")
    private Integer id;

    @Column(name = "description")
    private String description;

    @Column(name = "calories")
    private int calories;

    public Meal() {
    }

    public Meal(String description, int calories) {
        this.description = description;
        this.calories = calories;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getId() {
        return id;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public int getCalories() {
        return calories;
    }

    public void setCalories(int calories) {
        this.calories = calories;
    }
}
