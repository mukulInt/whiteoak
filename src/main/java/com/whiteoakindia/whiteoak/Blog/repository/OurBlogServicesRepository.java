package com.whiteoakindia.whiteoak.Blog.repository;

import com.whiteoakindia.whiteoak.Blog.entity.OurBlog;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface OurBlogServicesRepository extends JpaRepository<OurBlog,Long> {

    List<OurBlog> findAllByStatusOrderByCreatedAtDesc(Integer status);
    OurBlog findByIdAndStatus(Long id,Integer status);
}
