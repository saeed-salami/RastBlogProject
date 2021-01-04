package com.mapsa.blog.modules.posts.controller;

import com.mapsa.blog.modules.posts.model.Posts;
import com.mapsa.blog.modules.posts.service.PostsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("post")
public class PostsController {

    private PostsService postsService;

    @Autowired
    public PostsController(PostsService postsService) {
        this.postsService = postsService;
    }

    @GetMapping
    public List<Posts> findAllPost() {
        return postsService.findAllPost();
    }

    @PostMapping
    public Posts creatPost(@RequestBody Posts posts) {
        return postsService.creatPost(posts);
    }

    @DeleteMapping
    public void deletePostById(Long id) {
        postsService.deletePostById(id);
    }
}
