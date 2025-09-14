package com.datlab.beStrong.repository;

import com.datlab.beStrong.models.Categories;
import com.datlab.beStrong.models.Todos;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.UUID;

@Repository
public interface CategoryRepository extends JpaRepository<Categories, UUID> {}
