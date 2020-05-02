package com.qyc.result;

import com.qyc.entity.Order;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Optional;

/**
 * @author qyc
 * @time 2020/4/22 - 17:21
 */

public class CommonResult<T> {
    private int code;
    private String message;
    private T data;


    public CommonResult() {
    }

    public CommonResult(int i, String 失败, T order) {
        this.code = code;
        this.message = message;
        this.data = order;
    }

    public int getCode() {
        return code;
    }

    public void setCode(int code) {
        this.code = code;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public T getData() {
        return data;
    }

    public void setData(T data) {
        this.data = data;
    }

    @Override
    public String toString() {
        return "CommonResult{" +
                "code=" + code +
                ", message='" + message + '\'' +
                ", data=" + data +
                '}';
    }
}
