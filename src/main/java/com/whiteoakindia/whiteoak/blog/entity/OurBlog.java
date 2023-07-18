package com.whiteoakindia.whiteoak.blog.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDateTime;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
public class OurBlog {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id", nullable = false)
    private Long id;

    @Column(name = "heading")
    private String blogHeading;

    @Column(name = "author_name")
    private String authorName;

    @Column(name = "created_at")
    private LocalDateTime createdAt;

    @Column(name = "description")
    private String blogDescription;

    @Column(name = "details", columnDefinition = "text")
    private String blogDetails;

    @Column(name = "status")
    private Integer status;



}
