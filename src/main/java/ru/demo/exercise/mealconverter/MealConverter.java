package ru.demo.exercise.mealconverter;

import ru.demo.exercise.models.Meal;

import javax.persistence.AttributeConverter;
import javax.persistence.Converter;
import java.sql.Timestamp;
import java.time.LocalDateTime;
import java.util.Date;
import java.util.Optional;

@Converter(autoApply = true)
public class MealConverter implements AttributeConverter<Meal, String > {
    private static final String SEPARATOR = ", ";

    @Override
    public String convertToDatabaseColumn(Meal meal) {
        StringBuilder sb = new StringBuilder();
        sb.append(meal.getCalories())
                .append(SEPARATOR)
                .append(meal.getDatetime())
                .append(SEPARATOR)
                .append(meal.getDescription());
        return sb.toString();
    }

    @Override
    public Meal convertToEntityAttribute(String dbData) {
        String[] fields = dbData.split(SEPARATOR);
        Meal meal = new Meal();
        meal.setCalories(Integer.parseInt(fields[0]));
        meal.setDatetime(LocalDateTime.parse(fields[1]));
        meal.setDescription(fields[2]);

        return meal;
    }


    /*@Override
    public Timestamp convertToDatabaseColumn(LocalDateTime localDateTime) {
        return Optional.ofNullable(localDateTime)
                .map(Timestamp::valueOf)
                .orElse(null);
    }

    @Override
    public LocalDateTime convertToEntityAttribute(Timestamp timestamp) {
        return Optional.ofNullable(timestamp)
                .map(Timestamp::toLocalDateTime)
                .orElse(null);
    }*/
}

