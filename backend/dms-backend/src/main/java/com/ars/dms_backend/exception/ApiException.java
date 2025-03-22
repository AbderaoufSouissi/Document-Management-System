package com.ars.dms_backend.exception;

public class ApiException extends RuntimeException {
    public ApiException(String message) {
        super(message);
    }
    public ApiException() {
        super("There was an error");
    }
}
