package com.example.petstorerest.exception;

public class InvalidIdentifierException extends RuntimeException{
    public InvalidIdentifierException() {
        super();
    }

    public InvalidIdentifierException(String message) {
        super(message);
    }

    public InvalidIdentifierException(String message, Throwable cause) {
        super(message, cause);
    }

    public InvalidIdentifierException(Throwable cause) {
        super(cause);
    }

    protected InvalidIdentifierException(String message, Throwable cause, boolean enableSuppression,
                                 boolean writableStackTrace) {
        super(message, cause, enableSuppression, writableStackTrace);
    }
}
