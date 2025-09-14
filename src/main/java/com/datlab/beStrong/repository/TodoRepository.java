package com.datlab.beStrong.repository;

import com.datlab.beStrong.models.Todos;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.UUID;

public interface TodoRepository extends JpaRepository<Todos, UUID> {}
