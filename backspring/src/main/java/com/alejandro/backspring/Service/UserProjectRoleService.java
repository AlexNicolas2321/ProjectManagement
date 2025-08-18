package com.alejandro.backspring.Service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.alejandro.backspring.Entity.UserProjectRole;
import com.alejandro.backspring.Entity.UserProjectRoleId;
import com.alejandro.backspring.Repository.UserProjectRoleRepository;

@Service
public class UserProjectRoleService {
    
    private final UserProjectRoleRepository userProjectRoleRepository;

    public UserProjectRoleService (UserProjectRoleRepository userProjectRoleRepository){
        this.userProjectRoleRepository=userProjectRoleRepository;
    }

    public UserProjectRole assignRole(UserProjectRole userProjectRole) {
        // avoid duplicates
        UserProjectRoleId id = new UserProjectRoleId(
            userProjectRole.getUser().getId(),
            userProjectRole.getProject().getId(),
            userProjectRole.getRole().getId()
        );
        if (userProjectRoleRepository.existsById(id)) {
            throw new RuntimeException("This user already has this role in this project.");
        }
        userProjectRole.setId(id);
        return userProjectRoleRepository.save(userProjectRole);
    }
    
    //get all user+Role+Project 
    public List<UserProjectRole> getAllUserProjectRoles() {
        return userProjectRoleRepository.findAll();
    }

    //get all project of a user
    public List<UserProjectRole> getProjectsByUser(Integer UserId) {
        return userProjectRoleRepository.findUserProjectByUser(UserId);
    }

    //get all user + role of a project
    public List<UserProjectRole> getUsersByProject(Integer projectId){
        return userProjectRoleRepository.findUserProjectByProject(projectId);
    }

    

    
}
