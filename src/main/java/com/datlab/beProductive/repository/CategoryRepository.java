package com.datlab.beProductive.repository;

import com.datlab.beProductive.models.Categories;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.UUID;

@Repository
public interface CategoryRepository extends JpaRepository<Categories, UUID> {}
