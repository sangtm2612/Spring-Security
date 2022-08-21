package com.example.springsecurity.common.utils;

import com.example.springsecurity.common.consts.StatusCode;

public class SingleResponse<T> extends BaseResponse{
    private T data;

    public SingleResponse(T data) {
        this.data = data;
        code = StatusCode.STATUS_CODE_OK;
        message = "Success";
    }

    public SingleResponse() {
    }
}
