package web.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import web.Service.CarService;
import web.Service.CarServiceImpl;
import web.model.Car;

import java.util.ArrayList;
import java.util.List;

@Controller
public class CarsController {

    @GetMapping(value = "/cars")
    public String printWelcome(ModelMap model, @RequestParam(value = "count", required = false) String count) {
        List<String> messages = new ArrayList<>();
        messages.add("Hello!");
        messages.add("I'm Cars Table");
        model.addAttribute("messages", messages);
        List<Car> cars = new ArrayList<>();
        cars.add(new Car("Audi", "RS6", 600));
        cars.add(new Car("BMW", "M3 Competition", 510));
        cars.add(new Car("Mercedes", "AMG GT", 639));
        cars.add(new Car("Mazda", "MX-5", 160));
        cars.add(new Car("Tesla", "Model S 'Plaid'", 1020));
        CarService refresh = new CarServiceImpl();
        model.addAttribute("table", refresh.refreshTable(cars, count, messages));
        return "cars";
    }
}