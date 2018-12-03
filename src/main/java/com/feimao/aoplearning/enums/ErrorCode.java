package com.feimao.aoplearning.enums;

public enum ErrorCode {

    TEST(10001, "测试");

    private Integer errorCode;
    private String errorMessage;

    ErrorCode(Integer errorCode, String errorMessage) {
        this.errorCode = errorCode;
        this.errorMessage = errorMessage;
    }

    public Integer getErrorCode() {
        return errorCode;
    }

    public String getErrorMessage() {
        return errorMessage;
    }

}
