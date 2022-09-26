package web.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import web.service.CarService;

import java.util.ArrayList;
import java.util.List;

@Controller
public class CarsController {

    @Autowired
    CarService carService;

    @GetMapping(value = "/cars")
    public String printWelcome(ModelMap model,
                               @RequestParam(value = "count", required = false) String count) {
        List<String> messages = new ArrayList<>();
        messages.add("Hello!");
        messages.add("I'm Cars Table");
        model.addAttribute("messages", messages);
        model.addAttribute("table", carService.refreshTable(count, messages));
        return "cars";
    }
}