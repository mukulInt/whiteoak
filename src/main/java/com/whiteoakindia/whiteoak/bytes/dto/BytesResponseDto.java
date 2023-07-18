package com.whiteoakindia.whiteoak.bytes.dto;


import com.whiteoakindia.whiteoak.bytes.entity.Bytes;
import com.whiteoakindia.whiteoak.utils.DateFormatUtils;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDateTime;
import java.util.Objects;


@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class BytesResponseDto {


    private Long id;


    private String title;


    private String image;


    private String attachment;


    private String shortDescription;


    private String description;


    private String createdAt;


    private Integer status;

    public BytesResponseDto(Bytes bytes,boolean isListResponse) {
        this.id = bytes.getId();
        this.title = bytes.getTitle();
        this.image = bytes.getImage();
        this.shortDescription = bytes.getDescription();
        this.createdAt = DateFormatUtils.getDateInFrontEndFormat(bytes.getCreatedAt());
        this.status = bytes.getStatus();
        this.description = isListResponse?"": bytes.getDescription();
        this.attachment = Objects.isNull(bytes.getBytesAttachment())?null:bytes.getBytesAttachment().getAttachment();
    }





}
