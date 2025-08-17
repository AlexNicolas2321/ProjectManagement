package com.alejandro.backspring.Repository;

import com.alejandro.backspring.Entity.Project;
import com.alejandro.backspring.Entity.User;
import com.alejandro.backspring.Entity.UserProjectRole;
import com.alejandro.backspring.Entity.UserProjectRoleId;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import java.util.List;

@Repository
public interface UserProjectRoleRepository extends JpaRepository<UserProjectRole,UserProjectRoleId>{
    
    List<UserProjectRole> findByUser(User user);
    List<UserProjectRole> findByProject(Project project);
    List<UserProjectRole> findByUserAndProject(User user, Project project);
}
