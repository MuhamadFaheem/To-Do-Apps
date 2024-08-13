package com.enigmacamp.simpetodoapp.controller;

import com.enigmacamp.simpetodoapp.entity.ToDo;
import com.enigmacamp.simpetodoapp.service.ToDoService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/v1/todo")
@RequiredArgsConstructor
public class ToDoController {
    private final ToDoService toDoService;

    @PostMapping("/add")
    public void  addNewToDo(@RequestBody ToDo toDo){
        toDoService.addNewToDo(toDo);
    }
    @RequestMapping("/finds")
    public List<ToDo> findAll(){
        return toDoService.findAll();
    }

    @RequestMapping("/find/{id}")
    public ToDo findById(@PathVariable String id){
        return toDoService.findById(id);
    }

    @PutMapping("/update")
    public void update(@RequestBody ToDo toDo){
        toDoService.update(toDo);
    }
    @DeleteMapping("/delete/{id}")
    public void deleteById(@PathVariable String id){
        toDoService.deleteById(id);
    }
}