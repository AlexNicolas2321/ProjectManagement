package com.alejandro.backspring.Service;

import org.springframework.stereotype.Service;

import java.util.List;
import com.alejandro.backspring.Entity.Role;
import com.alejandro.backspring.Repository.RoleRepository;

@Service
public class RoleService {
    
    private final RoleRepository roleRepository;

    public RoleService (RoleRepository roleRepository){
        this.roleRepository=roleRepository;
    }

    public List<Role> getAllRoles (){
        return roleRepository.findAll();
    }
    
    public Role createRole (Role role){
        return roleRepository.save(role);
    }

    public void deleteRole(Integer id){
         roleRepository.deleteById(id);
    }

}
