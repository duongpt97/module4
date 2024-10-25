package com.maskman97a.bookingsalon.dto;

import jakarta.persistence.Column;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class BranchDto extends BaseDto{
    private String name;

    private String address;
}
