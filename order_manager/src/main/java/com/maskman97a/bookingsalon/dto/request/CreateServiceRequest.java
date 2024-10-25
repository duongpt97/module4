package com.maskman97a.bookingsalon.dto.request;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.time.LocalDate;
import java.util.List;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class CreateServiceRequest {
    private Long id;
    private String name;
    private Long price;
    private int estimateMinutes;
    private int estimateHour;
}
