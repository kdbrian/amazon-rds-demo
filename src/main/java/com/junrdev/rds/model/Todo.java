package com.junrdev.rds.model;

import jakarta.persistence.*;

@Entity
@Table(schema = "spring-rds")
public class Todo {

    @SequenceGenerator( allocationSize = 1, sequenceName = "todo_seq", name = "todo_seq")
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "todo_seq")
    @Id
    Long id;
    String title;
    String content;


}
