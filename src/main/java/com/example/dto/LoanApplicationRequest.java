package com.example.dto;

import lombok.Data;

@Data
public class LoanApplicationRequest {
    private Double amountRequired;
    private Integer loanTerm;

}
