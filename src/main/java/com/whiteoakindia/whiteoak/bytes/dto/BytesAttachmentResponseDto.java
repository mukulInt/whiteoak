package com.whiteoakindia.whiteoak.bytes.dto;


import com.whiteoakindia.whiteoak.bytes.entity.BytesAttachment;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class BytesAttachmentResponseDto {

    private Long id;

    private String attachmentName;

    private Object attachment;

    public BytesAttachmentResponseDto(BytesAttachment bytesAttachment){
        this.id= bytesAttachment.getId();
        this.attachmentName= bytesAttachment.getAttachmentName();
        this.attachment=bytesAttachment.getAttachment();
    }

}
