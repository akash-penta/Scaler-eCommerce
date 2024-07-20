package com.akash.productservice.dtos;

import com.akash.productservice.models.AttributeTerm;
import lombok.Getter;
import lombok.Setter;

import java.util.UUID;

@Getter
@Setter
public class AttributeTermResponseDto {
    private UUID    id;
    private String  attribute;
    private String  value;

    public AttributeTermResponseDto(AttributeTerm attributeTerm) {
        this.id         = attributeTerm.getId();
        this.attribute  = attributeTerm.getAttribute().getName();
        this.value      = attributeTerm.getValue();
    }
}
