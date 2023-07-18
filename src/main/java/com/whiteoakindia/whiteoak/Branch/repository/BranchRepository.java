package com.whiteoakindia.whiteoak.Branch.repository;

import com.whiteoakindia.whiteoak.Branch.entity.Branch;
import com.whiteoakindia.whiteoak.Branch.enums.Region;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


import java.util.List;

@Repository
public interface BranchRepository extends JpaRepository<Branch,Long> {

    List<Branch> findByRegionAndStatus(Region region, Integer status);
}
