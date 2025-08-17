package com.alejandro.backspring.Service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.alejandro.backspring.Entity.Project;
import com.alejandro.backspring.Entity.User;
import com.alejandro.backspring.Entity.UserProjectRole;
import com.alejandro.backspring.Repository.UserProjectRoleRepository;

@Service
public class UserProjectRoleService {
    
    private final UserProjectRoleRepository userProjectRoleRepository;

    public UserProjectRoleService (UserProjectRoleRepository userProjectRoleRepository){
        this.userProjectRoleRepository=userProjectRoleRepository;
    }
    
    //get all user+Role+Project 
    public List<UserProjectRole> getAllUserProjectRoles() {
        return userProjectRoleRepository.findAll();
    }

    //take all project of a user + role
    public List<UserProjectRole> getProjectsByUser(User user) {
        return userProjectRoleRepository.findByUser(user);
    }

    //take all user + role of a project
    public List<UserProjectRole> getUsersByProject(Project project){
        return userProjectRoleRepository.findByProject(project);
    }

    

    
}
