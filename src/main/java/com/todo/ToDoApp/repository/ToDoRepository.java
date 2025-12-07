package com.todo.ToDoApp.repository;

import com.todo.ToDoApp.entity.ToDo;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ToDoRepository extends JpaRepository<ToDo, Long> {
}
