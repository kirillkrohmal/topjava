package ru.demo.exercise.controller;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import ru.demo.exercise.models.Meal;
import ru.demo.exercise.service.datajpa.DataJpaMealServiceImpl;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.LocalDateTime;
import java.util.Date;


@Controller
public class JspMealController {
    @Autowired
    DataJpaMealServiceImpl mealService;

    private LocalDateTime datetime;

    String dateString = String.valueOf(datetime);


    @GetMapping(value = "/list")
    public String getAll(Model model) {
        model.addAttribute("meals", mealService.getAll());
        return "meals";
    }

    @GetMapping(value = "/createForm")
    public String addForm(Model model) {
        Meal meal = new Meal();
        model.addAttribute("mealsCreate", meal);

        return "createmealForm";
    }

    @PostMapping(value = "/create")
    public String save(@ModelAttribute("mealsCreate") Meal meal) throws ParseException {


        Date parsed = new SimpleDateFormat("dd-MMM-yyyy").parse(dateString);


        mealService.save(meal);
        return "redirect:/list";
    }

    @GetMapping(value = "/delete")
    public String deleteMeal(@RequestParam("mealId") int id) {
        mealService.delete(id);
        return "redirect:/list";
    }

    @GetMapping(value = "/updateForm")
    public String updateForm(@RequestParam("mealId") int id, Model model) {
        Meal meal = mealService.get(id);
        model.addAttribute("mealsUpdate", meal);

        return "updatemealForm";
    }

    @PostMapping(value = "/update")
    public String update(@ModelAttribute("mealsUpdate") Meal meal) {
        mealService.update(meal);
        return "redirect:/list";
    }
}
