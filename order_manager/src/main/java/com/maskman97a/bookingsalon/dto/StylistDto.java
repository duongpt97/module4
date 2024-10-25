package com.maskman97a.bookingsalon.dto;

import com.maskman97a.bookingsalon.dto.enums.SexEnum;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class StylistDto extends BaseDto {
    private String name;

    private SexEnum sex;
    private Integer age;
}
