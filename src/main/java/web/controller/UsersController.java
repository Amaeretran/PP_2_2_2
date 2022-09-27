package web.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import web.service.UserService;

import java.util.ArrayList;
import java.util.List;

@Controller
public class UsersController {

    private final UserService userService;

    @Autowired
    public UsersController(UserService userService) {
        this.userService = userService;
    }

    @GetMapping(value = "/users")
    public String printWelcome(ModelMap model,
                               @RequestParam(value = "count", required = false) String count) {
        List<String> messages = new ArrayList<>();
        messages.add("Hello!");
        messages.add("I'm Users Table");
        model.addAttribute("messages", messages);
        model.addAttribute("table", userService.refreshTable(count, messages));
        return "users";
    }
}