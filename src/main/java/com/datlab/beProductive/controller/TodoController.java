package com.datlab.beProductive.controller;

import com.datlab.beProductive.dto.CommonModel;
import com.datlab.beProductive.dto.TodoDTO;
import com.datlab.beProductive.models.Todos;
import com.datlab.beProductive.services.ITodoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.UUID;

@RestController
@RequestMapping("/todo")
public class TodoController {

    @Autowired private ITodoService todoService;

    @GetMapping
    public CommonModel<Page<TodoDTO>> getAllTodo() {
        return null;
    }

    @GetMapping("/{id}")
    public CommonModel<TodoDTO> getTodoById() {
        return null;
    }

    @PostMapping
    public CommonModel<UUID> createTodo(@RequestBody TodoDTO requestTodo) {
        UUID createdId = todoService.createNewTodo(requestTodo);
        return new CommonModel<>(createdId, HttpStatus.CREATED.value());
    }

    @PutMapping
    public CommonModel<UUID> updateTodo() {
        return null;

    }

    @DeleteMapping
    public CommonModel<UUID> deleteTodo() {
        return null;

    }

}
