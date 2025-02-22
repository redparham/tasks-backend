package org.parham.tasksbackend.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TasksController {
    @RequestMapping("/")
    public String home() {
        return "Hello Docker World";
    }
}
