package ua.goit.springbootsecurity.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class LogoutController {
    @RequestMapping(method = RequestMethod.GET, value = "/logout/ok")
    public String getNotesList() {
        return "logout";
    }
}