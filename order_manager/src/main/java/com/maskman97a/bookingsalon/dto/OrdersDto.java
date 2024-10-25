package com.maskman97a.bookingsalon.dto;

import com.maskman97a.bookingsalon.common.DataUtil;
import com.maskman97a.bookingsalon.common.DateUtil;
import com.maskman97a.bookingsalon.dto.BaseDto;
import com.maskman97a.bookingsalon.dto.ServiceDto;
import com.maskman97a.bookingsalon.entity.ProductEntity;
import jakarta.persistence.Column;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.List;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class OrdersDto {
    private Long id;
    private LocalDateTime orderDate;
    private Integer quantity;
    private ProductEntity product;

    private String orderDateStr;

    public String getOrderDateStr() {
        if (!DataUtil.isNullObject(orderDate)) {
            orderDateStr = DateUtil.formatLocalDateTime(orderDate);
        }
        return orderDateStr;
    }

    public void setOrderDateStr(String orderDateStr) {
        this.orderDateStr = orderDateStr;
    }
}
