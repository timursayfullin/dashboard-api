package services.dashboardapi.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import services.dashboardapi.entities.Task;
import services.dashboardapi.repositories.TaskRepository;

import java.util.List;

@Controller
public class TaskController {
    TaskRepository taskRepository;

    @Autowired
    public TaskController(
            TaskRepository taskRepository
    ) {
        this.taskRepository = taskRepository;
    }

    public List<Task> getCompletedTasks() {
        return this.taskRepository.findAll();
    }
}
