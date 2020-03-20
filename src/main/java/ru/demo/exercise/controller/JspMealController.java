package ru.demo.exercise.controller;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import ru.demo.exercise.models.Meal;
import ru.demo.exercise.service.MealService;


@Controller
public class JspMealController extends AbstractMealController {

    @Autowired
    MealService mealService;

    @GetMapping(value = "/list")
    public String getAll(Model model) {
        model.addAttribute("meals", mealService.get());

        return "meals";
    }

    @GetMapping(value = "/create")
    public String addForm(Model model) {
        Meal meal = new Meal();
        model.addAttribute("mealsCreate", meal);

        return "createmealForm";
    }

    @PostMapping
    public String save(Meal meal) {
        super.add(meal);
        return "redirect:/list";
    }

    @PostMapping(value = "/delete")
    public String deleteMeal(Meal meal) {
        super.delete(meal);
        return "redirect:/list";
    }

    @GetMapping(value = "/update")
    public String updateForm(Model model) {
        Meal meal = new Meal();
        model.addAttribute("mealsUpdate", meal);

        return "updatemealForm";
    }

    @PostMapping
    public String updateMeal(int id, Meal meal) {
        super.update(id, meal);
        return "redirect:/list";
    }
}
