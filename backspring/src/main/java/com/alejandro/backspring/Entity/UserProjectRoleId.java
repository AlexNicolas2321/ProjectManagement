package com.alejandro.backspring.Entity;

import java.io.Serializable;
import java.util.Objects;
import jakarta.persistence.*;
import lombok.*;

@Embeddable
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class UserProjectRoleId implements Serializable {

    @Column(name = "user_id")
    private int user;

    @Column(name = "project_id")
    private int project;

    @Column(name = "role_id")
    private int role;

    // equals y hashCode (important for complex PK)
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof UserProjectRoleId)) return false;
        UserProjectRoleId that = (UserProjectRoleId) o;
        return user == that.user &&
               project == that.project &&
               role == that.role;
    }

    @Override
    public int hashCode() {
        return Objects.hash(user, project, role);
    }

    
}
