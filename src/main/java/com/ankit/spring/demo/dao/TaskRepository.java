package com.ankit.spring.demo.dao;


import com.ankit.spring.demo.entity.TaskEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface TaskRepository extends JpaRepository<TaskEntity, Integer> {

}
