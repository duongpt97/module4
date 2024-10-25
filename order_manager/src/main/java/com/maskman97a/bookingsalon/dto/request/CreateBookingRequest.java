package com.maskman97a.bookingsalon.dto.request;

import com.maskman97a.bookingsalon.dto.TimeSlotDto;
import jakarta.persistence.Column;
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
public class CreateBookingRequest {
    private Long customerId;

    private LocalDate bookingDate;

    private Long timeSlotId;

    private List<Long> serviceIdList;

    private Long branchId;
    private Long stylistId;
}
