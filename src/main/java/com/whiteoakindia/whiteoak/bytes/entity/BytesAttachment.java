package com.whiteoakindia.whiteoak.bytes.entity;


import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.hibernate.annotations.CreationTimestamp;

import java.time.LocalDateTime;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
@Entity
public class BytesAttachment {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "attachment_name")
    private String attachmentName;

    @Column(name = "attachment" ,columnDefinition = "text")
    private String attachment;

    @Column(name = "attachment_type")
    private String attachmentType;


    private Integer status;


    @CreationTimestamp
    private LocalDateTime createdAt;



}
