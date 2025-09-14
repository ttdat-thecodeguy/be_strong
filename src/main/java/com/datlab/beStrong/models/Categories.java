package com.datlab.beStrong.models;

import jakarta.persistence.*;

import java.util.HashSet;
import java.util.Set;
import java.util.UUID;

@Table
@Entity(name = "tbs_categories")
public class Categories {
    @Id
    private UUID id;
    private String name;

    @Lob
    @Column(name = "metadata")
    private String metadata;

    @ManyToMany(mappedBy = "categories")
    private Set<Todos> todos = new HashSet<>();
}
