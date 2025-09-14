package com.datlab.beProductive.services.impl;

import com.datlab.beProductive.dto.TodoDTO;
import com.datlab.beProductive.models.Todos;
import com.datlab.beProductive.repository.TodoRepository;
import com.datlab.beProductive.services.ITodoService;
import lombok.RequiredArgsConstructor;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.stereotype.Service;

import java.util.UUID;

@Service
@RequiredArgsConstructor
public class TodoServiceImpl implements ITodoService {
    @Autowired
    private TodoRepository todoRepository;

    @Autowired
    private ModelMapper modelMapper;

    @Override
    public Page<TodoDTO> getAllTodoList(String name, int page, int size) {

        return null;
    }

    @Override
    public UUID createNewTodo(TodoDTO todoDTO) {
        Todos newTodo = modelMapper.map(todoDTO, Todos.class);
        newTodo.setNew();
        Todos saved = todoRepository.save(newTodo);
        return saved.getId();
    }

    @Override
    public UUID updateNewTodo(TodoDTO todoDTO) {
        return null;
    }

    @Override
    public UUID deleteTodo() {
        return null;
    }
}
