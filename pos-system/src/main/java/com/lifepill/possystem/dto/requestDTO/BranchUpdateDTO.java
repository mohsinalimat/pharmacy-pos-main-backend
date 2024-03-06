package com.lifepill.possystem.dto.requestDTO;

import lombok.*;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@ToString
public class BranchUpdateDTO {
    private int branchId;
    private String branchName;
    private String branchAddress;
    private String branchContact;
    private String branchFax;
    private String branchEmail;
    private String branchDescription;
    private String branchImage;
    private boolean branchStatus;
    private String branchLocation;
    private String branchCreatedOn;
    private String branchCreatedBy;
}
