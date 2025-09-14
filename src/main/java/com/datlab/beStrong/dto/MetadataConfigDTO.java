package com.datlab.beStrong.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;

@Data
public class MetadataConfigDTO {
    private String icon;

    @JsonProperty("bg_color")
    private String bgColor;
}
