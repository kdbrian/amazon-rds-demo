package com.junrdev.rds.model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Table
@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
//@Data
public class Todo {

    @SequenceGenerator( allocationSize = 1, sequenceName = "todo_seq", name = "todo_seq")
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "todo_seq")
    @Id
    Long id;
    String title;
    String content;


}
