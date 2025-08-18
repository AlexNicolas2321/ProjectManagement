package com.alejandro.backspring.Controller;

import com.alejandro.backspring.Entity.Project;
import com.alejandro.backspring.Service.ProjectService;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("api/projects")
public class ProjectController {
    
    private final ProjectService projectService;

    public ProjectController (ProjectService projectService){
        this.projectService=projectService;
    }

    

    @PostMapping("/createProject")
    public Project createProject(@RequestBody Project project) {
        return projectService.createProject(project);
    }

    @DeleteMapping("/deleteProject/{id}")
    public void deleteProject (@PathVariable Integer id){
        projectService.deleteProject(id);
    }
}
