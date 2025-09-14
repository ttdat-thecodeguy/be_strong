package com.datlab.beProductive.repository;

import com.datlab.beProductive.dao.TodoListDAO;
import com.datlab.beProductive.models.Todos;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.UUID;

public interface TodoRepository extends JpaRepository<Todos, UUID> {
//    @Query(value = "select * from tbs_todos")
//    public Page<TodoListDAO> getAllTodosByName(String name, Pageable pageRequest);
}
