package com.abhinay.RestAbhinay.Exception;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

@ControllerAdvice
public class CloudVendorExceptionHandler {

    @ExceptionHandler(value = {CloudVendorNotFoundException.class})
    public ResponseEntity<CloudvendorException> handleCloudVendorNotFoundException(CloudVendorNotFoundException cloudVendorNotFoundException) {
        CloudvendorException cloudvendorException = new CloudvendorException(
                cloudVendorNotFoundException.getMessage(),
                cloudVendorNotFoundException.getCause(),
                HttpStatus.NOT_FOUND);
        return new ResponseEntity<>(cloudvendorException, HttpStatus.NOT_FOUND);
    }
}
