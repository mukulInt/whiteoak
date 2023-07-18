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
public class Bytes {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;


    private String title;

    @Column(name = "image" , columnDefinition = "text")
    private String image;

    @Column(name = "description" ,columnDefinition = "text")
    private String description;

    @Column(name = "short_description",columnDefinition = "text")
    private String shortDescription;

    @OneToOne
    @JoinColumn(name = "attachment_id")
    private BytesAttachment bytesAttachment;

    @CreationTimestamp
    private LocalDateTime createdAt;


    private Integer status;
}
