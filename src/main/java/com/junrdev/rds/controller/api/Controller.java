package com.junrdev.rds.controller.api;

import com.junrdev.rds.model.Todo;
import com.junrdev.rds.service.TodoService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;


@RequestMapping("/todos/api")
public class Controller {

    private final TodoService service;

    public Controller(TodoService service) {
        this.service = service;
    }

    @GetMapping("/all")
    public ResponseEntity<List<Todo>> getTodos(){
        return ResponseEntity.ok(service.getAllTodos());
    }

    @PostMapping("/new")
    public ResponseEntity<String> createTodo(@RequestBody Todo todo){
        service.createTodo(todo);

        return ResponseEntity.ok("Saved");
    }
}
