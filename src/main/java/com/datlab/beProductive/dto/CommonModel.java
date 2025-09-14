package com.datlab.beProductive.dto;

import com.fasterxml.jackson.databind.PropertyNamingStrategies;
import com.fasterxml.jackson.databind.annotation.JsonNaming;
import lombok.Data;

@Data
@JsonNaming(PropertyNamingStrategies.SnakeCaseStrategy.class)
public class CommonModel<T> {
    private T data;
    private int statusCode;
    private String errorMessage;
    private int errorCode;

    public CommonModel(T data, int statusCode) {
        this.data = data;
        this.statusCode = statusCode;
    }
}
