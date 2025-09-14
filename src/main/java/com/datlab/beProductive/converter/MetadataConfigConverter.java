package com.datlab.beProductive.converter;

import com.datlab.beProductive.dto.MetadataConfigDTO;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import jakarta.persistence.AttributeConverter;
import lombok.extern.slf4j.Slf4j;

@Slf4j
public class MetadataConfigConverter implements AttributeConverter<MetadataConfigDTO, String> {
    private static final ObjectMapper objectMapper = new ObjectMapper();

    @Override
    public String convertToDatabaseColumn(MetadataConfigDTO address) {
        try {
            return objectMapper.writeValueAsString(address);
        } catch (JsonProcessingException jpe) {
            log.warn("Cannot convert Address into JSON");
            return null;
        }
    }

    @Override
    public MetadataConfigDTO convertToEntityAttribute(String value) {
        try {
            return objectMapper.readValue(value, MetadataConfigDTO.class);
        } catch (JsonProcessingException e) {
            log.warn("Cannot convert JSON into Address");
            return null;
        }
    }
}
