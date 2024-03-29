package ua.goit.springbootsecurity.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class TestController {
    @RequestMapping(method = RequestMethod.GET, value = "/test")
    public String getNotesList() {
        return "test";
    }
}
