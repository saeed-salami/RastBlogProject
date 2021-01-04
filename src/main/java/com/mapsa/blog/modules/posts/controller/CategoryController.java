package com.mapsa.blog.modules.posts.controller;

import com.mapsa.blog.modules.posts.model.Category;
import com.mapsa.blog.modules.posts.service.CategoryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("category")
public class CategoryController {

    private CategoryService categoryService;

    @Autowired
    public CategoryController(CategoryService categoryService) {
        this.categoryService = categoryService;
    }

    @GetMapping
    public List<Category> getAllCategory() {
        return categoryService.getAllCategory();
    }

    @PostMapping
    public Category createCategory(@RequestBody Category category) {
        return categoryService.creatCategory(category);
    }

    @DeleteMapping
    public void deleteCategoryById(Long id) {
        categoryService.deleteCategoryById(id);
    }
}
