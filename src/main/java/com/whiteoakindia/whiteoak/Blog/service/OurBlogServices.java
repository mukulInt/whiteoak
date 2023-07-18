package com.whiteoakindia.whiteoak.Blog.service;

import com.whiteoakindia.whiteoak.Blog.dto.OurBlogDto;
import com.whiteoakindia.whiteoak.Blog.entity.OurBlog;


import java.util.List;

public interface OurBlogServices {

    public List<OurBlogDto> getAllBlogs();

    public OurBlog getBlogById(Long blogId);
}
