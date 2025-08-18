package com.alejandro.backspring.Service;

import java.util.List;

import com.alejandro.backspring.Entity.Project;
import com.alejandro.backspring.Entity.Task;
import com.alejandro.backspring.Repository.TaskRepository;
import org.springframework.stereotype.Service;

@Service
public class TaskService {

    private final TaskRepository taskRepository;

    public TaskService (TaskRepository taskRepository){
        this.taskRepository=taskRepository;
    }

    public List<Task> getAllTaskProject (Integer id){

        Project project= new Project();
        project.setId(id);
        return taskRepository.findbyProject(project);   
    }
    
    public Task createTask(Task task) {
        return taskRepository.save(task);
    }

    public void deleteTask(Integer id) {
        taskRepository.deleteById(id);
    }


}
