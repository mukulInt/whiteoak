package com.whiteoakindia.whiteoak.blog.service;

import com.whiteoakindia.whiteoak.blog.dto.OurBlogDto;
import com.whiteoakindia.whiteoak.blog.entity.OurBlog;


import java.util.List;

public interface OurBlogServices {

    public List<OurBlogDto> getAllBlogs();

    public OurBlog getBlogById(Long blogId);
}
