package com.maskman97a.bookingsalon.dto;

import com.maskman97a.bookingsalon.dto.enums.DeleteEnum;
import jakarta.persistence.Column;
import jakarta.persistence.Id;
import lombok.Getter;
import lombok.Setter;

import java.time.LocalDateTime;

@Getter
@Setter
public class BaseDto {
    protected Long id;
    protected LocalDateTime createdAt;
    protected String createdBy;
    protected LocalDateTime updatedAt;
    protected String updatedBy;
    protected DeleteEnum isDeleted;
}
