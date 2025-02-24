package org.parham.tasksbackend.services;

import org.parham.tasksbackend.model.Task;
import org.springframework.data.repository.ListCrudRepository;

public interface TasksRepository extends ListCrudRepository<Task, Integer> { }
