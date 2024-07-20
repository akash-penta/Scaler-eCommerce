package com.akash.productservice.controllers;

import com.akash.productservice.dtos.CategoryRequestDto;
import com.akash.productservice.dtos.CategoryResponseDto;
import com.akash.productservice.models.Category;
import com.akash.productservice.services.CategoryService;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

@RestController
@RequestMapping("/api/categories")
public class CategoryController {
    private final CategoryService categoryService;

    public CategoryController(CategoryService categoryService) {
        this.categoryService = categoryService;
    }

    @RequestMapping(
            method = RequestMethod.GET
    )
    public List<CategoryResponseDto> getAllCategories() {
        List<Category> categoryList = categoryService.getAllCategories();
        List<CategoryResponseDto> categoryResponseDtoList = new ArrayList<>();

        for(Category category : categoryList)




            categoryResponseDtoList.add(new CategoryResponseDto(category));

        return categoryResponseDtoList;
    }

    @RequestMapping(
            method = RequestMethod.POST
    )
    public CategoryResponseDto createNewCategory(@RequestBody CategoryRequestDto requestDto) {
        Category product = categoryService.createNewCategory(requestDto);
        return new CategoryResponseDto(product);
    }

    @RequestMapping(
            method = RequestMethod.GET,
            path = "{id}"
    )
    public CategoryResponseDto getCategoryById(@PathVariable UUID id) {
        Category category = categoryService.getCategoryById(id);
        return new CategoryResponseDto(category);
    }

    @RequestMapping(
            method = RequestMethod.PUT,
            path = "{id}"
    )
    public CategoryResponseDto updateCategoryById(@PathVariable UUID id,
                                                  @RequestBody  CategoryRequestDto requestDto) {
        Category category = categoryService.updateCategoryById(id, requestDto);
        return new CategoryResponseDto(category);
    }

    @RequestMapping(
            method = RequestMethod.DELETE,
            path = "{id}"
    )
    public CategoryResponseDto deleteCategoryById(@PathVariable UUID id) {
        Category category = categoryService.deleteCategoryById(id);
        return new CategoryResponseDto(category);
    }
}
