package com.whiteoakindia.whiteoak.blog.repository;

import com.whiteoakindia.whiteoak.blog.entity.OurBlog;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;
import java.util.Optional;

public interface OurBlogServicesRepository extends JpaRepository<OurBlog,Long> {

    List<OurBlog> findAllByStatusOrderByCreatedAtDesc(Integer status);
    Optional<OurBlog> findByIdAndStatus(Long id, Integer status);
}
