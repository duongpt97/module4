package com.maskman97a.bookingsalon.dto.request;

import lombok.Data;

@Data
public class BaseRequest<T> {
    private T data;
}
