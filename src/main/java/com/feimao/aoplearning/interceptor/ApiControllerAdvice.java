package com.feimao.aoplearning.interceptor;

import com.feimao.aoplearning.common.BaseResponse;
import com.feimao.aoplearning.exception.BusinessException;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

@RestControllerAdvice
public class ApiControllerAdvice {

    @ExceptionHandler(BusinessException.class)
    public BaseResponse handleBussinessException(BusinessException businessException) {
        System.out.println("business exception");
        return new BaseResponse().setErrorCode(businessException.getCode()).setErrorMessage(businessException.getMessage());
    }

    @ExceptionHandler(Exception.class)
    public BaseResponse handleException(Exception e) {
        System.out.println("runtime exception");
        return new BaseResponse().setErrorMessage(e.getMessage());
    }

}
