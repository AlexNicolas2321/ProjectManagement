package com.alejandro.backspring.Repository;

import com.alejandro.backspring.Entity.Task;
import com.alejandro.backspring.Entity.Project;

import java.util.List;
import org.springframework.stereotype.Repository;
import org.springframework.data.jpa.repository.JpaRepository;

@Repository
public interface TaskRepository extends JpaRepository<Task,Integer>{
    
    List<Task> findbyProject (Project project);

    List<Task> findByStatus(String status);

    List<Task> findByParentId(Integer parentId);

    List<Task> findByParentIdIsNull();

}
