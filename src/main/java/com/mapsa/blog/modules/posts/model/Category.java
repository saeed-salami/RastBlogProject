package com.mapsa.blog.modules.posts.model;

import com.fasterxml.jackson.annotation.JsonIdentityInfo;
import com.fasterxml.jackson.annotation.ObjectIdGenerators;
import lombok.Data;

import javax.persistence.*;
import java.time.LocalDateTime;
import java.util.List;

@Data
@Entity
@Table
@JsonIdentityInfo(generator = ObjectIdGenerators.PropertyGenerator.class,property = "id")
public class Category {

    @Id
    @GeneratedValue
    private long id;
    private String title;

    @ManyToMany(mappedBy = "categories")
    private List<Posts> posts;

    private LocalDateTime createdAt;
    private LocalDateTime updatedAt;

}
