package com.feimao.aoplearning.common;

import com.feimao.aoplearning.enums.ErrorCode;
import lombok.Data;
import lombok.experimental.Accessors;

@Data
@Accessors(chain = true)
public class BaseResponse<TResult> {

    private Integer errorCode = 0;

    private String errorMessage = "";

    private TResult result;

    public BaseResponse<TResult> of(ErrorCode errorCode) {
        return this.setErrorCode(errorCode.getErrorCode()).setErrorMessage(errorCode.getErrorMessage());
    }
}
