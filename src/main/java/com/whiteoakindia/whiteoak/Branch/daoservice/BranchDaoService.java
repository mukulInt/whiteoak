package com.whiteoakindia.whiteoak.Branch.daoservice;


import com.whiteoakindia.whiteoak.Branch.entity.Branch;
import com.whiteoakindia.whiteoak.Branch.enums.Region;
import com.whiteoakindia.whiteoak.Branch.repository.BranchRepository;
import com.whiteoakindia.whiteoak.utils.ActiveInactiveStatusUtils;
import org.springframework.stereotype.Component;


import java.util.List;

@Component
public class BranchDaoService {


    private BranchRepository branchRepository;

    private ActiveInactiveStatusUtils activeInactiveStatusUtils;


    public BranchDaoService(BranchRepository branchRepository,ActiveInactiveStatusUtils activeInactiveStatusUtils) {
        this.branchRepository = branchRepository;
        this.activeInactiveStatusUtils = activeInactiveStatusUtils;
    }


    public List<Branch> getALLBranchByRegion(Region region){
        Integer activeStatus = activeInactiveStatusUtils.getActiveStatus();
        return branchRepository.findByRegionAndStatus(region,activeStatus);
    }
}
