package com.maskman97a.bookingsalon.dto.response;

import com.maskman97a.bookingsalon.dto.BranchDto;
import com.maskman97a.bookingsalon.dto.ServiceDto;
import com.maskman97a.bookingsalon.dto.StylistDto;
import com.maskman97a.bookingsalon.dto.TimeSlotDto;
import lombok.Data;

import java.util.List;

@Data
public class BookingGetConfigResponse {
    List<TimeSlotDto> timeSlotList;
    List<BranchDto> branchList;
    List<ServiceDto> serviceList;
}
