package com.whiteoakindia.whiteoak.Blog.controller;

import com.whiteoakindia.whiteoak.Blog.dto.OurBlogDto;
import com.whiteoakindia.whiteoak.Blog.entity.OurBlog;
import com.whiteoakindia.whiteoak.Blog.service.OurBlogServices;
import com.whiteoakindia.whiteoak.Branch.dto.BranchDto;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/v1/blogs")
public class OurBlogController {
    private final OurBlogServices ourBlogServices;

    public OurBlogController(OurBlogServices ourBlogServices) {
        this.ourBlogServices = ourBlogServices;
    }

    @GetMapping("/all")
    public List<OurBlogDto> getAllBlogs(){
        return ourBlogServices.getAllBlogs();
    }

    @GetMapping("/{blogId}")
    public OurBlog getAllBranches(@PathVariable("blogId") Long blogId){
        return ourBlogServices.getBlogById(blogId);
    }



}
