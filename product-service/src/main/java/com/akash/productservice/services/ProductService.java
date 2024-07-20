package com.akash.productservice.services;

import com.akash.productservice.dtos.ProductRequestDto;
import com.akash.productservice.dtos.ProductUpdateRequestDto;
import com.akash.productservice.dtos.ProductVariationRequestDto;
import com.akash.productservice.dtos.ProductVariationUpdateRequestDto;
import com.akash.productservice.exceptions.ProductNotFoundException;
import com.akash.productservice.models.Product;
import com.akash.productservice.models.ProductVariation;

import java.util.List;
import java.util.UUID;

public interface ProductService {
    public List<Product> getAllProducts(String sort, String sortBy, int limit, int offset);

    public Product getProductById(UUID id) throws ProductNotFoundException;

    public Product createNewProduct(ProductRequestDto requestDto);

    public Product updateProductById(UUID id, ProductUpdateRequestDto requestDto) throws ProductNotFoundException;

    public Product deleteProductById(UUID id) throws ProductNotFoundException;

    public List<ProductVariation> getAllProductVariations(UUID id) throws ProductNotFoundException;

    public ProductVariation getProductVariationById(UUID id, UUID varId);

    public ProductVariation updateProductVariationById(UUID id, UUID varId, ProductVariationUpdateRequestDto requestDto);

    public ProductVariation deleteProductVariationById(UUID id, UUID varId);

    public ProductVariation createNewProductVariation(UUID id, ProductVariationRequestDto requestDto) throws ProductNotFoundException;
}
