package com.maskman97a.bookingsalon.dto;

import lombok.Data;
import lombok.Getter;
import lombok.Setter;

import java.time.LocalDateTime;

@Getter
@Setter
public class TimeSlotDto extends BaseDto {
    private String startTime;
    private String description;
    private Integer slotIndex;
}
