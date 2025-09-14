package com.datlab.beProductive.dto;

import lombok.Data;

import java.util.UUID;

@Data
public class TodoDTO {
    private String name;
    private String description;
    private UUID parent;
    private MetadataConfigDTO metadata;
}
