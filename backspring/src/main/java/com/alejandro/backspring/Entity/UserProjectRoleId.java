package com.alejandro.backspring.Entity;
import java.io.Serializable;
import java.util.Objects;

public class UserProjectRoleId implements Serializable {
    private int user;
    private int project;
    private int role;

    public UserProjectRoleId() {}

    public UserProjectRoleId(int user, int project, int role) {
        this.user = user;
        this.project = project;
        this.role = role;
    }

    // equals and hashCode override (important)
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
