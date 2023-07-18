package com.whiteoakindia.whiteoak.branch.entity;


import com.whiteoakindia.whiteoak.branch.enums.Region;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.hibernate.annotations.CreationTimestamp;

import java.time.LocalDateTime;

@Data
@Entity
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class Branch {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "branch_name")
    private String branchName;

    @Column(name = "address_line_1")
    private String addressLine1;

    @Column(name = "address_line_2")
    private String addressLine2;

    @Column(name = "address_line_3")
    private String addressLine3;

    @Enumerated(EnumType.STRING)
    private Region region;

    private String city;

    private String state;

    private String pinCode;

    @CreationTimestamp
    private LocalDateTime createdAt;

    private Integer status;

}
