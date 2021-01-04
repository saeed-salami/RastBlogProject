package com.mapsa.blog.modules.posts.service;

import com.mapsa.blog.modules.posts.model.Posts;
import com.mapsa.blog.modules.posts.repository.PostsRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.List;

@Service
public class PostsService {

    private PostsRepository postsRepository;

    @Autowired
    public PostsService(PostsRepository postsRepository) {
        this.postsRepository = postsRepository;
    }

    @Transactional
    public Posts creatPost(Posts posts) {
        return postsRepository.save(posts);
    }

    public List<Posts> findAllPost() {
        return postsRepository.findAll();
    }

    public void deletePostById(Long id) {
        postsRepository.deleteById(id);
    }
}
