package com.mazzillio.scheduler_notification_api.infrastructure.repositories;

import com.mazzillio.scheduler_notification_api.infrastructure.entities.Schedule;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ScheduleRepository extends JpaRepository<Schedule,Long> {
}
