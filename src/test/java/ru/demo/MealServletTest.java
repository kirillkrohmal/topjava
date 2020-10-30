package ru.demo;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.web.WebAppConfiguration;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.transaction.annotation.Transactional;
import ru.demo.exercise.service.MealService;

@ContextConfiguration({
        "classpath:spring/spring-context.xml",
        "classpath:spring/spring-db.xml",
        "classpath:spring/spring-jdbc.xml"
})
@WebAppConfiguration
@Transactional
public class MealServletTest {


    protected MockMvc mockMvc;

    @Autowired
    private MealService mealService;



}
