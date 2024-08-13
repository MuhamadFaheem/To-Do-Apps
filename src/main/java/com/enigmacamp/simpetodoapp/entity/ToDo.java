package com.enigmacamp.simpetodoapp.entity;

import jakarta.persistence.*;
import lombok.*;

@Entity
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class ToDo {

    @Id
    @Column(nullable = false, name = "todo_id")
    private String id;
    private String title;
    private String description;
    private Boolean isCompleted = Boolean.FALSE;
}
