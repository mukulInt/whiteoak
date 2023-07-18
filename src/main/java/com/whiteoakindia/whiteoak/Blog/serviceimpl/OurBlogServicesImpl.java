package com.whiteoakindia.whiteoak.Blog.serviceimpl;

import com.whiteoakindia.whiteoak.Blog.daoservice.OurBlogDaoServices;
import com.whiteoakindia.whiteoak.Blog.dto.OurBlogDto;
import com.whiteoakindia.whiteoak.Blog.entity.OurBlog;
import com.whiteoakindia.whiteoak.Blog.service.OurBlogServices;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class OurBlogServicesImpl implements OurBlogServices {
    private final OurBlogDaoServices ourBlogDaoServices;

    public OurBlogServicesImpl(OurBlogDaoServices ourBlogDaoServices) {
        this.ourBlogDaoServices = ourBlogDaoServices;
    }



    @Override
    public OurBlog getBlogById(Long blogId) {
        return ourBlogDaoServices.getBlogById(blogId);
    }


    @Override
    public List<OurBlogDto> getAllBlogs() {
        List<OurBlog> allBlogBasedOnDate = ourBlogDaoServices.getAllBlogBasedOnDate();
        return convertEntityToDto(allBlogBasedOnDate);

    }


    private List<OurBlogDto> convertEntityToDto(List<OurBlog> ourBlogs){
        return ourBlogs.stream().map(OurBlogDto :: new).collect(Collectors.toList());
    }
}
