package com.todo.ToDoApp.service;

import com.todo.ToDoApp.entity.ToDo;
import com.todo.ToDoApp.repository.ToDoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

@Service
public class ToDoService  {
    @Autowired
    ToDoRepository repository;

    public ToDo create(ToDo toDo){
       return repository.save(toDo);
    }


}
