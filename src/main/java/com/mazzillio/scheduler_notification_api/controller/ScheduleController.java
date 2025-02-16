package com.mazzillio.scheduler_notification_api.controller;

import com.mazzillio.scheduler_notification_api.business.ScheduleService;
import com.mazzillio.scheduler_notification_api.controller.dtos.in.ScheduleRecord;
import com.mazzillio.scheduler_notification_api.controller.dtos.out.ScheduleRecordOut;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequiredArgsConstructor
@RequestMapping("/schedule")
public class ScheduleController {

    private final ScheduleService scheduleService;

    @PostMapping
    public ResponseEntity<ScheduleRecordOut> saveSchedule(@RequestBody ScheduleRecord scheduleRecord) {
        return ResponseEntity.ok(scheduleService.saveSchedule(scheduleRecord));
    }
}
