package com.akash.productservice.dtos;

import com.akash.productservice.models.Category;
import com.akash.productservice.models.Product;
import com.akash.productservice.models.ProductVariation;
import com.akash.productservice.models.Seller;
import lombok.Getter;
import lombok.Setter;

import java.util.List;
import java.util.UUID;

@Getter
@Setter
public class ProductResponseDto {
    private UUID                            id;
    private String                          name;
    private String                          description;
    private List<Category>                  categories;
    private Seller seller;
    private List<ProductVariation>          variations;

    public ProductResponseDto(Product product) {
        this.id              = product.getId();
        this.name            = product.getName();
        this.description     = product.getDescription();
        this.categories      = product.getCategories();
        this.seller          = product.getSeller();
        this.variations      = product.getProductVariation();
    }
}
