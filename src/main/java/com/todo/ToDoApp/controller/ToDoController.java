package com.todo.ToDoApp.controller;

import com.todo.ToDoApp.entity.ToDo;
import com.todo.ToDoApp.service.ToDoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/v1/todo")
public class ToDoController {
    @Autowired
    ToDoService service;

    @GetMapping("/")
    public String get(){
        return "Todo App";
    }
    @PostMapping("/create")
    public ResponseEntity<ToDo> create(@RequestBody ToDo toDo){
        return new ResponseEntity<>(service.create(toDo), HttpStatus.CREATED);
    }
}
