package com.whiteoakindia.whiteoak.Branch.service;


import com.whiteoakindia.whiteoak.Branch.dto.BranchDto;

import java.util.List;

public interface BranchService {

    List<BranchDto> getAllBranchByRegion(String region);


}
