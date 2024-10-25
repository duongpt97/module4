package com.maskman97a.bookingsalon.dto;

import com.maskman97a.bookingsalon.common.DataUtil;
import jakarta.persistence.Column;
import lombok.Getter;
import lombok.Setter;

import java.text.DecimalFormat;
import java.text.NumberFormat;
import java.util.Locale;

@Getter
@Setter
public class ServiceDto extends BaseDto {
    private static final DecimalFormat decimalFormat = new DecimalFormat("#,###");
    private String name;

    private Long price;

    private int estimateMinutes;

    private int estimateHour;

    private String priceStr;
    private String estimateMinutesStr;
    private String estimateHourStr;

    public ServiceDto() {
    }

    public ServiceDto(String name, Long price, int estimateMinutes, int estimateHour) {
        this.name = name;
        this.price = price;
        this.estimateMinutes = estimateMinutes;
        this.estimateHour = estimateHour;
    }

    public ServiceDto(Long id,String name, Long price, int estimateMinutes, int estimateHour) {
        this.id = id;
        this.name = name;
        this.price = price;
        this.estimateMinutes = estimateMinutes;
        this.estimateHour = estimateHour;
    }

    public String getPriceStr() {
        if (!DataUtil.isNullObject(price))
            priceStr = decimalFormat.format(price);
        return priceStr;
    }

    public void setPriceStr(String priceStr) {
        this.priceStr = priceStr;
    }

    public String getEstimateMinutesStr() {
        if (!DataUtil.isNullObject(estimateMinutes)) {
            estimateMinutesStr = decimalFormat.format(estimateMinutes);
        }
        return estimateMinutesStr;
    }

    public void setEstimateMinutesStr(String estimateMinutesStr) {
        this.estimateMinutesStr = estimateMinutesStr;
    }

    public String getEstimateHourStr() {
        if (!DataUtil.isNullObject(estimateHour)) {
            estimateHourStr = decimalFormat.format(estimateHour);
        }
        return estimateHourStr;
    }

    public void setEstimateHourStr(String estimateHourStr) {
        this.estimateHourStr = estimateHourStr;
    }
}
