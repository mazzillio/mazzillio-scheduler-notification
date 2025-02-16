package com.mazzillio.scheduler_notification_api.business.mapper;

import com.mazzillio.scheduler_notification_api.controller.dtos.in.ScheduleRecord;
import com.mazzillio.scheduler_notification_api.controller.dtos.out.ScheduleRecordOut;
import com.mazzillio.scheduler_notification_api.infrastructure.entities.Schedule;
import org.mapstruct.Mapper;
import static org.mapstruct.MappingConstants.ComponentModel.SPRING;

@Mapper(componentModel = SPRING)
public interface IScheduleMapper {
    Schedule toEntity(ScheduleRecord scheduleRecord);
    ScheduleRecordOut toOut(Schedule schedule);

}
