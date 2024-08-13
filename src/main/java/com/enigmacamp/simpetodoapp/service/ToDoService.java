package com.enigmacamp.simpetodoapp.service;

import com.enigmacamp.simpetodoapp.entity.ToDo;

import java.util.List;

public interface ToDoService {
    void addNewToDo(ToDo toDo);
    List<ToDo> findAll();
    ToDo findById(String id);
    void deleteById(String id);
    void update(ToDo toDo);
}
