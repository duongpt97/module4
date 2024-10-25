package com.maskman97a.bookingsalon.dto.response;

import com.maskman97a.bookingsalon.common.ErrorType;
import lombok.Data;
import lombok.Getter;

@Data
public class BaseResponse<T> {
    private T data;
    private int errorCode;
    private String errorMessage;
    private String description;

    public BaseResponse() {
        setError(ErrorType.SUCCESS);
    }

    public void setError(ErrorType error) {
        this.errorCode = error.getErrorCode();
        this.errorMessage = error.getErrorMessage();
        this.description = error.getDescription();
    }
}
