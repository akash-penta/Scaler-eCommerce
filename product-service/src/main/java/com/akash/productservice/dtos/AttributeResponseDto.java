package com.akash.productservice.dtos;

import com.akash.productservice.models.Attribute;
import lombok.Getter;
import lombok.Setter;

import java.util.UUID;

@Getter
@Setter
public class AttributeResponseDto {
    private UUID    id;
    private String  name;

    public AttributeResponseDto(Attribute attribute) {
        this.id     = attribute.getId();
        this.name   = attribute.getName();
    }
}