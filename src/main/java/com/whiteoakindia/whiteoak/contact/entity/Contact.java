package com.whiteoakindia.whiteoak.contact.entity;


import com.whiteoakindia.whiteoak.contact.dto.ContactDto;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.hibernate.annotations.CreationTimestamp;

import java.time.LocalDateTime;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class Contact {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;


    private String name;

    private String email;

    private int countryCode;

    private String phoneNo;

    private String location;

    private String userType;

    private String reachingOutPurpose;

    @Column(name = "comment" ,columnDefinition = "TEXT")
    private String comment;

    @CreationTimestamp
    private LocalDateTime createdAt;

    public Contact(ContactDto dto) {
        this.name = dto.getName();
        this.email = dto.getEmail();
        this.countryCode= dto.getCountryCode();
        this.phoneNo = dto.getEmail();
        this.location = dto.getLocation();
        this.userType = dto.getUserType();
        this.reachingOutPurpose = dto.getReachingOutPurpose();
        this.comment = dto.getComment();
    }
}
