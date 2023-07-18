package com.whiteoakindia.whiteoak.blog.daoservice;

import com.whiteoakindia.whiteoak.blog.entity.OurBlog;
import com.whiteoakindia.whiteoak.blog.repository.OurBlogServicesRepository;
import com.whiteoakindia.whiteoak.common.exception.ServiceException;
import com.whiteoakindia.whiteoak.common.utils.ActiveInactiveStatusUtils;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.Optional;

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
            throw new ServiceException("Blog not found!");
        }

    }

    public OurBlog getBlogById(Long blogId) {
        Optional<OurBlog> blogById = ourBlogServicesRepository.findByIdAndStatus(blogId, activeInactiveStatusUtils.getActiveStatus());

        if(blogById.isPresent()){
            return blogById.get();
        }else{
            throw new ServiceException("Blog not found with given blog id!");
        }
    }





}
