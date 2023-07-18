package com.whiteoakindia.whiteoak.branch.repository;

import com.whiteoakindia.whiteoak.branch.entity.Branch;
import com.whiteoakindia.whiteoak.branch.enums.Region;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


import java.util.List;

@Repository
public interface BranchRepository extends JpaRepository<Branch,Long> {

    List<Branch> findByRegionAndStatus(Region region, Integer status);
}
