package com.whiteoakindia.whiteoak.branch.daoservice;


import com.whiteoakindia.whiteoak.branch.entity.Branch;
import com.whiteoakindia.whiteoak.branch.enums.Region;
import com.whiteoakindia.whiteoak.branch.repository.BranchRepository;
import com.whiteoakindia.whiteoak.common.utils.ActiveInactiveStatusUtils;
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
