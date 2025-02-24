package org.parham.tasksbackend.controller;

import org.parham.tasksbackend.dto.Task;
import org.parham.tasksbackend.services.TasksService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class TasksController {
    private final TasksService tasksService;

    TasksController(TasksService tasksService) {
        this.tasksService = tasksService;
    }

    @GetMapping("tasks")
    public List<Task> getTasks() {
        return tasksService.findAllTasks();
    }
}
