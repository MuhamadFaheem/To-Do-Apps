package com.enigmacamp.simpetodoapp.repository;

import com.enigmacamp.simpetodoapp.entity.ToDo;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ToDoRepository extends JpaRepository<ToDo, String> {

}
