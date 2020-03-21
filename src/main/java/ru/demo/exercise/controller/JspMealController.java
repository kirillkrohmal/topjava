package ru.demo.exercise.controller;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import ru.demo.exercise.models.Meal;
import ru.demo.exercise.service.MealService;


@Controller
public class JspMealController {
    @Autowired
    MealService mealService;

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
    public String save(@ModelAttribute("mealsCreate") Meal meal) {
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
