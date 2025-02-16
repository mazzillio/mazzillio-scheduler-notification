package com.mazzillio.scheduler_notification_api.infrastructure.exceptions;

public class NotFoundException extends RuntimeException {
    public NotFoundException(String message) {
        super(message);
    }
}
