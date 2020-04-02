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

    @Convert(converter = MealConverter.class)
    @Column(name = "date_time")
    private LocalDateTime datetime;

    @Column(name = "description")
    private String description;

    @Column(name = "calories")
    private int calories;

    public Meal() {
    }

    public Meal(int id) {
        this.id = id;
    }

    public Meal(int id, LocalDateTime datetime, String description, int calories) {
        this.id = id;
        this.datetime = datetime;
        this.description = description;
        this.calories = calories;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getId() {
        return id;
    }

    public LocalDateTime getDatetime() {
        return datetime;
    }

    public void setDatetime(LocalDateTime datetime) {
        this.datetime = datetime;
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

    public boolean isNew() {
        return this.id == null;
    }
}
