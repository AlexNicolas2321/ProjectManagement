package com.alejandro.backspring.Entity;

import jakarta.persistence.*;
import lombok.*;

@Entity
@Getter
@Setter
@Builder
@NoArgsConstructor
@AllArgsConstructor
@Table(name = "user_project_role")
@IdClass(UserProjectRoleId.class)

public class UserProjectRole {
  
    
    @EmbeddedId
    private UserProjectRoleId id;

    @ManyToOne
    @MapsId("user")
    @JoinColumn(name = "user_id")
    private User user;

    @ManyToOne
    @MapsId("project")
    @JoinColumn(name = "project_id")
    private Project project;

    @ManyToOne
    @MapsId("role")
    @JoinColumn(name = "role_id")
    private Role role;

    
}