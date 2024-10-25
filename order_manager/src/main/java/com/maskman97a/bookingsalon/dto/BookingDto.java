package com.maskman97a.bookingsalon.dto;

import jakarta.persistence.Column;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.springframework.format.annotation.DateTimeFormat;

import javax.swing.text.DateFormatter;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.List;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class BookingDto extends BaseDto {
    private String branchName;
    private String timeSlotName;
    private String stylistName;
    private String customerName;
    private String customerPhone;
    private Long customerId;

    private LocalDate bookingDate;
    private String bookingDateStr;

    private Long timeSlotId;

    private Long branchId;

    private Long stylistId;

    private List<ServiceDto> serviceList;


    public BookingDto(Long id, String branchName, LocalDate bookingDate, String timeSlotName, String stylistName, String customerName, String customerPhone) {
        this.id = id;
        this.branchName = branchName;
        this.bookingDate = bookingDate;
        if (bookingDate != null) {
            this.bookingDateStr = DateTimeFormatter.ofPattern("dd/MM/yyyy").format(bookingDate);
        }
        this.timeSlotName = timeSlotName;
        this.stylistName = stylistName;
        this.customerName = customerName;
        this.customerPhone = customerPhone;
    }


}
