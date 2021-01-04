package com.mapsa.blog.modules.users.model;

import com.fasterxml.jackson.annotation.JsonIdentityInfo;
import com.fasterxml.jackson.annotation.ObjectIdGenerators;
import com.mapsa.blog.modules.posts.model.Posts;
import lombok.Data;


import javax.persistence.*;
import java.time.LocalDateTime;
import java.util.List;

@Data
@Entity
@Table
@JsonIdentityInfo(generator = ObjectIdGenerators.PropertyGenerator.class, property = "id")
public class Users {

    @Id
    @GeneratedValue
    private Long id;
    private String name;

    @OneToMany(mappedBy = "users")
    private List<Posts> posts;

    @Column(unique = true)
    private String email;
    private String password;
    private String cover;
    private LocalDateTime createdAt;
    private LocalDateTime updatedAt;
}
