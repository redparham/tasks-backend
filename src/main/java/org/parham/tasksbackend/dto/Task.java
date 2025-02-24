package org.parham.tasksbackend.dto;

import org.parham.tasksbackend.model.TaskStatus;

public record Task(int id, String name, TaskStatus status) { }

