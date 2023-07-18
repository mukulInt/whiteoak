package com.whiteoakindia.whiteoak.Blog.daoservice;

import com.whiteoakindia.whiteoak.Blog.entity.OurBlog;
import com.whiteoakindia.whiteoak.Blog.repository.OurBlogServicesRepository;
import com.whiteoakindia.whiteoak.utils.ActiveInactiveStatusUtils;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class OurBlogDaoServices {

    private final OurBlogServicesRepository ourBlogServicesRepository;
    private final ActiveInactiveStatusUtils activeInactiveStatusUtils;


    public OurBlogDaoServices(OurBlogServicesRepository ourBlogServicesRepository,
                              ActiveInactiveStatusUtils activeInactiveStatusUtils) {
        this.ourBlogServicesRepository = ourBlogServicesRepository;
        this.activeInactiveStatusUtils = activeInactiveStatusUtils;
    }

    public List<OurBlog> getAllByOrderByCreatedAtDesc() {
        return ourBlogServicesRepository.findAllByStatusOrderByCreatedAtDesc(activeInactiveStatusUtils.getActiveStatus());
    }


    public List<OurBlog> getAllBlogBasedOnDate(){

        List<OurBlog> allByOrderByCreatedAtDesc = getAllByOrderByCreatedAtDesc();

        if(!allByOrderByCreatedAtDesc.isEmpty()){
            return allByOrderByCreatedAtDesc;
        }
        else{
            return null;
        }

    }

    public OurBlog getBlogById(Long blogId) {
        return ourBlogServicesRepository.findByIdAndStatus(blogId,activeInactiveStatusUtils.getActiveStatus());
    }





}
