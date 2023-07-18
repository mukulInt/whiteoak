package com.whiteoakindia.whiteoak.branch.serviceimpl;

import com.whiteoakindia.whiteoak.branch.daoservice.BranchDaoService;
import com.whiteoakindia.whiteoak.branch.dto.BranchDto;
import com.whiteoakindia.whiteoak.branch.entity.Branch;
import com.whiteoakindia.whiteoak.branch.enums.Region;
import com.whiteoakindia.whiteoak.branch.service.BranchService;
import org.springframework.stereotype.Service;


import java.util.List;
import java.util.Objects;
import java.util.stream.Collectors;

@Service
public class BranchServiceImpl implements BranchService {

    private BranchDaoService branchDaoService;


    public BranchServiceImpl(BranchDaoService branchDaoService) {
        this.branchDaoService = branchDaoService;
    }

    @Override
    public List<BranchDto> getAllBranchByRegion(String  region) {

        Region regionEnum = verifyAndGetRegion(region);

        List<Branch> branchList = getAllBranchByRegionFromDB(regionEnum);

        return convertEntityToDto(branchList);
    }


    private Region verifyAndGetRegion(String region){
        Region regionEnum = Region.valueOf(region.trim().toUpperCase());

        if(Objects.isNull(regionEnum)){
            throw new RuntimeException("Invalid Region");
        }
        return regionEnum;
    }

    private List<Branch> getAllBranchByRegionFromDB(Region region){
        return branchDaoService.getALLBranchByRegion(region);
    }


    private List<BranchDto> convertEntityToDto(List<Branch> branchList){
        return branchList.stream().map(branch -> new BranchDto(branch)).collect(Collectors.toList());
    }
}
