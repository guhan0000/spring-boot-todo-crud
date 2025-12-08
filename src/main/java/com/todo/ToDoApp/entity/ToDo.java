package com.todo.ToDoApp.entity;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import jakarta.persistence.*;
import lombok.Data;
import org.springframework.http.HttpStatusCode;

@Entity
@Data
@JsonIgnoreProperties({"hibernateLazyInitializer", "handler"})
public class ToDo {
//    public long getId() {
//        return id;
//    }
//
//    public void setId(long id) {
//        this.id = id;
//    }
//
//    public String getTitle() {
//        return title;
//    }
//
//    public void setTitle(String title) {
//        this.title = title;
//    }
//
//    public String getDesc() {
//        return description;
//    }
//
//    public void setDesc(String desc) {
//        this.description = desc;
//    }
//
//    public boolean isCompleted() {
//        return isCompleted;
//    }
//
//    public void setCompleted(boolean completed) {
//        isCompleted = completed;
//    }

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    long id;
    String title;
    String description;
    boolean isCompleted;
}
