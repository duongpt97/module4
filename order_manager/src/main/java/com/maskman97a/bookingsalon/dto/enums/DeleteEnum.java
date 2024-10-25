package com.maskman97a.bookingsalon.dto.enums;

import lombok.Getter;

@Getter
public enum DeleteEnum {
    YES(1),
    NO(0);

    int value;

    DeleteEnum(int i) {
    }
}
