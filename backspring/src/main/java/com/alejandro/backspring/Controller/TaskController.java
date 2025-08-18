package com.alejandro.backspring.Controller;

import com.alejandro.backspring.Entity.Task;
import com.alejandro.backspring.Service.TaskService;

import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("api/task")
public class TaskController {
    
    private final TaskService taskService;

    public TaskController (TaskService taskService){
        this.taskService=taskService;
    }

    @PostMapping("/createTask")
    public Task createTask (@RequestBody Task task){
        return taskService.createTask(task);
    }

    @GetMapping("project/{id}")
    public List<Task> getTaskByProject (@PathVariable Integer id){
        return taskService.getAllTaskProject(id);
    }

    @DeleteMapping("/{id}")
    public void deleteTask(@PathVariable Integer id) {
        taskService.deleteTask(id);
    }
}
