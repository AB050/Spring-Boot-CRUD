package com.abhinay.RestAbhinay.Exception;

public class CloudVendorNotFoundException extends RuntimeException {

    // Constructor that accepts only a message
    public CloudVendorNotFoundException(String message) {
        super(message);
    }

    // Constructor that accepts both a message and a cause
    public CloudVendorNotFoundException(String message, Throwable cause) {
        super(message, cause);
    }
}
