package com.alejandro.backspring.Controller;

import com.alejandro.backspring.Entity.Role;
import com.alejandro.backspring.Service.RoleService;

import java.util.List;

import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("api/role")
public class RoleController {
    
    private final RoleService roleService;

    public RoleController (RoleService roleService){
        this.roleService=roleService;
    }

    @PostMapping("/createRole")
    public Role createRole(@RequestBody Role role) {
        return roleService.createRole(role);
    }

    @DeleteMapping("/deleteRole/{id}")
    public void deleteRole(@PathVariable Integer id) {
        roleService.deleteRole(id);
    }

    @GetMapping
    public List<Role> getAllRoles() {
    return roleService.getAllRoles();
}

}
