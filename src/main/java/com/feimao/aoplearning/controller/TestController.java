package com.feimao.aoplearning.controller;

import com.feimao.aoplearning.common.BaseResponse;
import com.feimao.aoplearning.enums.ErrorCode;
import com.feimao.aoplearning.exception.BusinessException;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TestController {

    @GetMapping("/return")
    public BaseResponse ret() {
        return new BaseResponse();
    }

    @GetMapping("/throw")
    public BaseResponse thr() {
        throw new BusinessException(ErrorCode.TEST);
    }

    @GetMapping("/null")
    public BaseResponse nul() {
        throw new NullPointerException();
    }

}
