package com.todo.ToDoApp.service;

import com.todo.ToDoApp.entity.ToDo;
import com.todo.ToDoApp.repository.ToDoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ToDoService  {
    @Autowired
    ToDoRepository repository;

    public ToDo create(ToDo toDo){
       return repository.save(toDo);
    }
    public ToDo get(long id){
        return repository.getReferenceById(id);
    }
    public List<ToDo> getAll(){
        return repository.findAll();
    }
    public  ToDo update(ToDo toDo){
        return repository.save(toDo);
    }
    public void delete(long id){
         repository.deleteById(id);
    }
    public void deleteAllTasks(){
        repository.deleteAll();
    }


}
