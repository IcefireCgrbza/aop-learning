package com.feimao.aoplearning.exception;

import com.feimao.aoplearning.enums.ErrorCode;
import lombok.Data;

@Data
public class BusinessException extends RuntimeException {

    private int code;

    public BusinessException(ErrorCode errorCode) {
        super(errorCode.getErrorMessage());
        this.code = errorCode.getErrorCode();
    }

}
