package com.mapsa.blog.modules.posts.model;

import com.fasterxml.jackson.annotation.JsonIdentityInfo;
import com.fasterxml.jackson.annotation.ObjectIdGenerators;
import com.mapsa.blog.modules.users.model.Users;
import lombok.Data;

import javax.persistence.*;
import java.time.LocalDateTime;
import java.util.List;

@Data
@Entity
@Table
@JsonIdentityInfo(generator = ObjectIdGenerators.PropertyGenerator.class, property = "id")
public class Posts {

    @Id
    @GeneratedValue
    private long id;
    private String title;
    private String body;
    private String cover;

    @ManyToMany
    private List<Category> categories;

    @ManyToOne
    private Users users;

    private LocalDateTime createdAt;
    private LocalDateTime updatedAt;
}
