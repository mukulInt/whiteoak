package com.whiteoakindia.whiteoak.dto;


import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class ContactDto {

    private String name;

    private String email;

    private int countryCode;

    private String phoneNo;

    private String location;

    private String userType;

    private String reachingOutPurpose;

    private String comment;
}
