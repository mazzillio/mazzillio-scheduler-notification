package com.mazzillio.scheduler_notification_api.controller.dtos.out;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.mazzillio.scheduler_notification_api.infrastructure.enums.NotificationStatusEnum;

import java.time.LocalDateTime;

public record ScheduleRecordOut(
        Long id,
        String recipientEmail,
        String recipientPhone,
        String message,
        @JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "dd-MM-yyyy HH:mm:ss")
        LocalDateTime hourDateShipping,
        NotificationStatusEnum notificationStatus

) {
}
