package com.whiteoakindia.whiteoak.branch.dto;

import com.whiteoakindia.whiteoak.branch.entity.Branch;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;


import java.util.Objects;


@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class BranchDto {

    private Long id;

    private String branchNameAndAddress;

    private String region;

    private String city;


    public BranchDto(Branch branch){

        String addressLine1= (Objects.isNull(branch.getAddressLine1()) || branch.getAddressLine1().trim().length()==0)?"":branch.getAddressLine1()+", ";

        String addressLine2= (Objects.isNull(branch.getAddressLine2()) || branch.getAddressLine2().trim().length()==0)?"":branch.getAddressLine2()+", ";

        String addressLine3= (Objects.isNull(branch.getAddressLine3()) || branch.getAddressLine3().trim().length()==0)?"":branch.getAddressLine3()+", ";



        this.id= branch.getId();
        this.region=branch.getRegion().toString();
        this.branchNameAndAddress=branch.getBranchName()+", "+addressLine1+addressLine2+addressLine3+branch.getCity()+", "+branch.getState()+", "+branch.getPinCode();
        this.city=branch.getCity();
                ;
    }

}
