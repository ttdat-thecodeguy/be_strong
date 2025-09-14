package com.datlab.beProductive.models;

import com.datlab.beProductive.converter.MetadataConfigConverter;
import com.datlab.beProductive.dto.MetadataConfigDTO;
import jakarta.persistence.*;
import lombok.Data;

import java.util.HashSet;
import java.util.Set;
import java.util.UUID;

@Entity
@Table(name = "tbs_todos")
@Data
public class Todos {
    @Id
    @Column(name = "id")

    private UUID id;

    private String name;

    private String description;

    @Column(name = "is_completed")
    private boolean isCompleted;

    @Column
    @Convert(converter = MetadataConfigConverter.class)
    private MetadataConfigDTO metadata;

    @Column(name = "parent")
    private UUID parent;

    @ManyToMany
    @JoinTable(
            name = "todo_categories",
            joinColumns = @JoinColumn(name = "todo_id"),
            inverseJoinColumns = @JoinColumn(name = "cate_id")
    )
    private Set<Categories> categories = new HashSet<>();

    public void setNew() {
        this.id=UUID.randomUUID();
    }
}
