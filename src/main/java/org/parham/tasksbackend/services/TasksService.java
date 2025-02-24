package org.parham.tasksbackend.services;

import org.parham.tasksbackend.dto.Task;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class TasksService {
    TasksRepository repo;

    TasksService(TasksRepository repository) {
        this.repo = repository;
    }

    public List<Task> findAllTasks() {
        var taskEntities = repo.findAll();
        return taskEntities.stream()
                .map(taskEntity -> new Task(taskEntity.getId(), taskEntity.getName(), taskEntity.getStatus()))
                .toList();
    }
}
