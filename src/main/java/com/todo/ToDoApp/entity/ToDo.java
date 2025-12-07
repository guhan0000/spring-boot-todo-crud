package com.todo.ToDoApp.entity;

import jakarta.persistence.*;

@Entity
@Table(name="todo")
public class ToDo {
    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getDesc() {
        return description;
    }

    public void setDesc(String desc) {
        this.description = desc;
    }

    public boolean isCompleted() {
        return isCompleted;
    }

    public void setCompleted(boolean completed) {
        isCompleted = completed;
    }

    @Id
    @GeneratedValue
    long id;
    @Column
    String title;
    @Column
    String description;
    @Column
    boolean isCompleted;
}
