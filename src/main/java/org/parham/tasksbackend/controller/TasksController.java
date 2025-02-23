package org.parham.tasksbackend.controller;

import org.parham.tasksbackend.Task;
import org.parham.tasksbackend.TaskStatus;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TasksController {
    @GetMapping("tasks")
    public Task[] getTasks() {
        return new Task[] {
                new Task(1, "Task A", TaskStatus.TODO),
                new Task(2, "Task B", TaskStatus.TODO),
                new Task(3, "Task C", TaskStatus.INPROGRESS),
                new Task(4, "Task D", TaskStatus.TODO),
                new Task(5, "Task E", TaskStatus.DONE)
        };
    }
}
