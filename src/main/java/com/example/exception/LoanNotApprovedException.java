package com.example.exception;

public class LoanNotApprovedException extends RuntimeException {
    public LoanNotApprovedException(String message) {
        super(message);
    }
}
