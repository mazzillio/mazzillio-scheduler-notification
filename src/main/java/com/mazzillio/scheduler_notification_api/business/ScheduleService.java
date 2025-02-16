package com.mazzillio.scheduler_notification_api.business;

import com.mazzillio.scheduler_notification_api.business.mapper.IScheduleMapper;
import com.mazzillio.scheduler_notification_api.controller.dtos.in.ScheduleRecord;
import com.mazzillio.scheduler_notification_api.controller.dtos.out.ScheduleRecordOut;
import com.mazzillio.scheduler_notification_api.infrastructure.repositories.ScheduleRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@RequiredArgsConstructor
@Service
public class ScheduleService {
    private final ScheduleRepository repository;
    private final IScheduleMapper iScheduleMapper;

    public ScheduleRecordOut saveSchedule(ScheduleRecord schedule) {
        return iScheduleMapper.toOut(repository.save(iScheduleMapper.toEntity(schedule)));
    }

}
