package com.nova.everisdarmytasksms.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.nova.everisdarmytasksms.controller.Task;

@Repository
public interface TaskRepository extends JpaRepository<Task, Integer>{

	List<Task> findAllByStatus(String status);

}
