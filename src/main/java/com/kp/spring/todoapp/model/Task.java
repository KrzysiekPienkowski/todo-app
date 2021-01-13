package com.kp.spring.todoapp.model;

import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Data
@Entity
@Table(name="tasks")
public class Task {
    @Id
    private int id;
    private String description;
    private boolean done;
    private int branch;
}
