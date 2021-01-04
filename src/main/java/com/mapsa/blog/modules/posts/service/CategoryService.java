package com.mapsa.blog.modules.posts.service;

import com.mapsa.blog.modules.posts.model.Category;
import com.mapsa.blog.modules.posts.repository.CategoryRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

import java.util.List;

@Service
public class CategoryService {

    private CategoryRepository categoryRepository;

    @Autowired
    public CategoryService(CategoryRepository categoryRepository) {
        this.categoryRepository = categoryRepository;
    }


    public Category creatCategory(Category category) {
        return categoryRepository.save(category);
    }


    public List<Category> getAllCategory() {
        return categoryRepository.findAll();
    }


    public void deleteCategoryById(Long id) {
        categoryRepository.deleteById(id);
    }
}
