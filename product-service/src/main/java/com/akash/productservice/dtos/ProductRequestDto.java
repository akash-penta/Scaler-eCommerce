package com.akash.productservice.dtos;

import com.akash.productservice.models.Category;
import com.akash.productservice.models.Seller;
import lombok.Getter;
import lombok.Setter;

import java.util.List;

@Getter
@Setter
public class ProductRequestDto {
    private String name;
    private String description;
    private List<Category> categories;
    private Seller seller;
    private long regularPrice;
    private long salesPrice;
    private String imageURI;
    private List<AttributeTermRequestDto> attributes;
    private long stockQuantity;
}
