package ru.demo.exercise.models;

import javax.persistence.Entity;
import javax.persistence.Table;
import java.time.LocalDateTime;



@Entity
public class Meal extends AbstractBaseEntity {
    private LocalDateTime dateTime;
    private String description;
    private int calories;

    public Meal() {
    }

    public Meal(Integer id, LocalDateTime dateTime, String description, int calories) {
        super(id);
        this.dateTime = dateTime;
        this.description = description;
        this.calories = calories;
    }

    public LocalDateTime getDateTime() {
        return dateTime;
    }

    public void setDateTime(LocalDateTime dateTime) {
        this.dateTime = dateTime;
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

    @Override
    public boolean isNew() {
        return false;
    }
}
