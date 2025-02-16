package com.mazzillio.scheduler_notification_api.controller.dtos.in;

import com.fasterxml.jackson.annotation.JsonFormat;

import java.time.LocalDateTime;

public record ScheduleRecord(String recipientEmail, String recipientPhone,
                             String message,
                             @JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "dd-MM-yyyy HH:mm:ss")
                             LocalDateTime hourDateShipping) {
}
