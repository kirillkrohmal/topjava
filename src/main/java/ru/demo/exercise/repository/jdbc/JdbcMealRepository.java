package ru.demo.exercise.repository.jdbc;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.namedparam.MapSqlParameterSource;
import org.springframework.jdbc.core.namedparam.NamedParameterJdbcTemplate;
import org.springframework.jdbc.core.simple.SimpleJdbcInsert;
import org.springframework.stereotype.Repository;
import ru.demo.exercise.repository.MealRepository;
import ru.demo.exercise.models.Meal;

import java.util.List;


@Repository
public abstract class JdbcMealRepository implements MealRepository {

    private static final BeanPropertyRowMapper<Meal> ROW_MAPPER = BeanPropertyRowMapper.newInstance(Meal.class);

    @Autowired
    private final JdbcTemplate jdbcTemplate;

    private final SimpleJdbcInsert insertMeals;

    @Autowired
    private final NamedParameterJdbcTemplate namedParameterJdbcTemplate;

    @Autowired
    protected JdbcMealRepository(JdbcTemplate jdbcTemplate, NamedParameterJdbcTemplate namedParameterJdbcTemplate) {
        this.insertMeals = new SimpleJdbcInsert(jdbcTemplate)
                .withTableName("meals")
                .usingGeneratedKeyColumns("id");

        this.jdbcTemplate = jdbcTemplate;
        this.namedParameterJdbcTemplate = namedParameterJdbcTemplate;
    }

    @Override
    public Meal save(Meal meal) {
        MapSqlParameterSource map = new MapSqlParameterSource()
                .addValue("id", meal.getId())
                .addValue("date_time", meal.getDatetime())
                .addValue("description", meal.getDatetime())
                .addValue("calories", meal.getCalories());

        namedParameterJdbcTemplate.update("INSERT INTO meals(id, date_time, description, calories) " +
                "VALUES(id=:id, date_time=:date_time, description=:description, calories=:calories)", map);

        return meal;
    }

    @Override
    public Meal update(Meal meal) {
        MapSqlParameterSource map = new MapSqlParameterSource()
                .addValue("id", meal.getId())
                .addValue("date_time", meal.getDatetime())
                .addValue("description", meal.getDatetime())
                .addValue("calories", meal.getCalories());

        namedParameterJdbcTemplate.update("" +
                "UPDATE meals " + " SET date_time=:date_time, description=:description, calories=:calories" +
                " WHERE id=:id", map);

        return meal;
    }

    @Override
    public Meal get(int id) {
        return jdbcTemplate.
                queryForObject("SELECT id, date_time, description, calories FROM meals WHERE id=?",
                        ROW_MAPPER, id);
    }

    @Override
    public List<Meal> getAll() {
        return jdbcTemplate.
                query("SELECT id, date_time, description, calories FROM meals", ROW_MAPPER);
    }

    @Override
    public void delete(int id) {
        jdbcTemplate.update("DELETE FROM meals WHERE id=?", id);
    }
}
