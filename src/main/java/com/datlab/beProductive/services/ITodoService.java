package com.datlab.beProductive.services;

import com.datlab.beProductive.dto.TodoDTO;
import org.springframework.data.domain.Page;

import java.util.UUID;

public interface ITodoService {
    public Page<TodoDTO> getAllTodoList(String name, int page, int size);
    public UUID createNewTodo(TodoDTO todoDTO);
    public UUID updateNewTodo(TodoDTO todoDTO);
    public UUID deleteTodo();
}
