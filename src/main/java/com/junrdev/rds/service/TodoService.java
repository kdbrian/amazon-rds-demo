package com.junrdev.rds.service;

import com.junrdev.rds.model.Todo;
import com.junrdev.rds.repo.TodoRepository;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

public class TodoService {


    private final TodoRepository repository;

    @Autowired
    public TodoService(TodoRepository repository) {
        this.repository = repository;
    }

    public List<Todo> getAllTodos(){
        return repository.findAll();
    }

    public Todo createTodo(Todo todo){
        return repository.save(todo);
    }
}
