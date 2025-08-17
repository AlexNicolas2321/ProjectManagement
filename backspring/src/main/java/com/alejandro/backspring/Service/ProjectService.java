package com.alejandro.backspring.Service;

import com.alejandro.backspring.Entity.Project;
import com.alejandro.backspring.Repository.ProjectRepository;

import org.springframework.stereotype.Service;

@Service
public class ProjectService {
    
    private final ProjectRepository projectRepository;

    public ProjectService (ProjectRepository projectRepository){
        this.projectRepository=projectRepository;
    }

    public Project createProject (Project project){
        return projectRepository.save(project);
    }

    public void deleteProject(Integer id){
        projectRepository.deleteById(id);
    }

    

}
