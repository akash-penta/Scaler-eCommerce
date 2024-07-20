package com.akash.productservice.dtos;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class ProductVariationUpdateRequestDto {
    private long    regularPrice;
    private long    salesPrice;
    private String  imageURI;
    private long    stockQuantity;
}
