package com.enigmacamp.simpetodoapp.service.impl;

import com.aventrix.jnanoid.jnanoid.NanoIdUtils;
import com.enigmacamp.simpetodoapp.entity.ToDo;
import com.enigmacamp.simpetodoapp.repository.ToDoRepository;
import com.enigmacamp.simpetodoapp.service.ToDoService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class ToDoServiceImpl implements ToDoService {
    private final ToDoRepository toDoRepository;
    @Override
    public void addNewToDo(ToDo toDo) {
        String todoId = "todo_"+ NanoIdUtils.randomNanoId();
        toDo.setId(todoId);
        toDoRepository.save(toDo);
    }

    @Override
    public List<ToDo> findAll() {
        return toDoRepository.findAll();
    }

    @Override
    public ToDo findById(String id) {
        return toDoRepository.findById(id).orElse(null);
    }

    @Override
    public void deleteById(String id) {
        toDoRepository.deleteById(id);
    }

    @Override
    public void update(ToDo toDo) {
        toDoRepository.save(toDo);
    }
}
