package com.mazzillio.scheduler_notification_api.infrastructure.entities;

import com.mazzillio.scheduler_notification_api.infrastructure.enums.NotificationStatusEnum;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;

import java.time.LocalDateTime;

@Table(name = "schedule")
@Entity
@Getter
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class Schedule {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String recipientEmail;

    private String recipientPhone;
    private LocalDateTime hourDateShipping;
    private LocalDateTime hourDateSchedule;
    private LocalDateTime hourDateModification;
    private String message;
    private NotificationStatusEnum notificationStatus;

    @PrePersist
    private void prePersist(){
        hourDateSchedule = LocalDateTime.now();
        notificationStatus = NotificationStatusEnum.SCHEDULED;
    }

}
