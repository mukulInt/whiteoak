package com.whiteoakindia.whiteoak.branch.service;


import com.whiteoakindia.whiteoak.branch.dto.BranchDto;

import java.util.List;

public interface BranchService {

    List<BranchDto> getAllBranchByRegion(String region);


}
