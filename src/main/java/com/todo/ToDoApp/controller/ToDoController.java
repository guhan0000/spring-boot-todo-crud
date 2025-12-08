package com.todo.ToDoApp.controller;

import com.todo.ToDoApp.entity.ToDo;
import com.todo.ToDoApp.service.ToDoService;
import io.swagger.v3.oas.annotations.responses.ApiResponse;
import io.swagger.v3.oas.annotations.responses.ApiResponses;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.http.HttpStatus;
import org.springframework.http.HttpStatusCode;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/v1/todo")
@Slf4j
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
    @ApiResponses(value = {
            @ApiResponse(responseCode = "200",description = "Task Fetched Successfully"),
            @ApiResponse(responseCode = "404",description = "Task Not Found")
    })
    @GetMapping("/get/{id}")
    public ResponseEntity<ToDo> get(@PathVariable long id){

                ToDo toDo=service.get(id);
//                log.info("Object Returned for available ID");
                return new ResponseEntity<>(toDo,HttpStatus.OK);
    }
    @GetMapping("/all")
    public ResponseEntity<List<ToDo>> getAll(){
        return new ResponseEntity<>(service.getAll(),HttpStatus.OK);
    }
    @GetMapping("/get/page")
    public ResponseEntity<Page<ToDo>> getAllPagedTasks(@RequestParam int page,@RequestParam int size){
        return new ResponseEntity<>(service.getAllPagedTasks(page,size),HttpStatus.OK);

    }
    @PutMapping("/update")
    public ResponseEntity<ToDo> update(@RequestBody ToDo toDo){
        return new ResponseEntity<>(service.update(toDo),HttpStatus.ACCEPTED);
    }
    @DeleteMapping("/delete/{id}")
    public void delete(@PathVariable long id){
        service.delete(id);

    }
    @DeleteMapping("/delete/all")
    public  void  deleteAllTasks(){
        service.deleteAllTasks();
    }

}
