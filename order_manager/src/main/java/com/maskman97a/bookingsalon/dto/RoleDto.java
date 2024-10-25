package com.maskman97a.bookingsalon.dto;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class RoleDto {
    private String name;

    public RoleDto(String name) {
        this.name = name;
    }
}
