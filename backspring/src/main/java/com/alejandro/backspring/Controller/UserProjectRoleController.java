package com.alejandro.backspring.Controller;

import java.util.List;

import org.springframework.web.bind.annotation.*;

import com.alejandro.backspring.Entity.UserProjectRole;
import com.alejandro.backspring.Service.UserProjectRoleService;



@RestController
@RequestMapping("api/userProjectRole")
public class UserProjectRoleController {
    
    private final UserProjectRoleService userProjectRoleService;

    public UserProjectRoleController (UserProjectRoleService userProjectRoleService){
        this.userProjectRoleService=userProjectRoleService;
    }

    @PostMapping
    public UserProjectRole assignRole(@RequestBody UserProjectRole userProjectRole) {
        return userProjectRoleService.assignRole(userProjectRole);
    }

    // get all project of a user
    @GetMapping("/user/{userId}/projects")
    public List<UserProjectRole> getProjectsByUser(@PathVariable Integer userId) {
        return userProjectRoleService.getProjectsByUser(userId);
    }

     // get all users of a project
     @GetMapping("/project/{projectId}/users")
     public List<UserProjectRole> getUsersByProject(@PathVariable Integer projectId) {
         return userProjectRoleService.getUsersByProject(projectId);
     }
}
