package com.whiteoakindia.whiteoak.Branch.controller;


import com.whiteoakindia.whiteoak.Branch.dto.BranchDto;
import com.whiteoakindia.whiteoak.Branch.service.BranchService;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;


import java.util.List;

@Controller
@RequestMapping("/branch")
public class BranchController {

    private BranchService branchService;

    public BranchController(BranchService branchService) {
        this.branchService = branchService;
    }


    // model needed to be added

    @GetMapping("/{region}")
    public List<BranchDto> getAllBranches(@PathVariable("region") String region){
        return branchService.getAllBranchByRegion(region);
    }


}
