package com.akash.productservice.dtos;

import com.akash.productservice.models.Category;
import lombok.Getter;
import lombok.Setter;

import java.util.UUID;

@Getter
@Setter
public class CategoryResponseDto {
    private UUID    id;
    private String  name;
    private String  description;

    public CategoryResponseDto(Category category) {
        this.id          = category.getId();
        this.name        = category.getName();
        this.description = category.getDescription();
    }
}
