package com.whiteoakindia.whiteoak.blog.dto;
import com.whiteoakindia.whiteoak.blog.entity.OurBlog;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import java.time.LocalDateTime;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class OurBlogDto {


    private Long id;

    private String blogHeading;

    private String authorName;

    private LocalDateTime createdAt;

    private String dateAndName;

    private String blogDescription;


    public OurBlogDto(OurBlog ourBlog){

        this.id= ourBlog.getId();
        this.blogHeading = ourBlog.getBlogHeading();
        this.authorName = ourBlog.getAuthorName();
        this.createdAt = ourBlog.getCreatedAt();
        this.blogDescription = ourBlog.getBlogDescription();
    }
}
