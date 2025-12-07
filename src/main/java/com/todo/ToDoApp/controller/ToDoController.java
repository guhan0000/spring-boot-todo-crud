package com.todo.ToDoApp.controller;

import com.todo.ToDoApp.entity.ToDo;
import com.todo.ToDoApp.service.ToDoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.HttpStatusCode;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/v1/todo")
public class ToDoController {
    @Autowired
    ToDoService service;

    @GetMapping("/")
    public String demo(){
        return "Todo App";
    }
    @PostMapping("/create")
    public ResponseEntity<ToDo> create(@RequestBody ToDo toDo){
        return new ResponseEntity<>(service.create(toDo), HttpStatus.CREATED);
    }
    @GetMapping("/get/{id}")
    public ResponseEntity<ToDo> get(@PathVariable long id){

            ToDo toDo=service.get(id);
            return new ResponseEntity<>(toDo,HttpStatus.OK);
    }
    @GetMapping("/all")
    public ResponseEntity<List<ToDo>> getAll(){
        return new ResponseEntity<>(service.getAll(),HttpStatus.OK);
    }
    @PutMapping("/update")
    public ResponseEntity<ToDo> update(@RequestBody ToDo toDo){
        return new ResponseEntity<>(service.update(toDo),HttpStatus.ACCEPTED);
    }
    @DeleteMapping("/delete/{id}")
    public void delete(@PathVariable long id){
        service.delete(id);

    }

}
