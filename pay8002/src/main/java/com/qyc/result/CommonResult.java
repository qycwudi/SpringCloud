package com.qyc.result;

/**
 * @author qyc
 * @time 2020/4/23 - 15:15
 */
public class CommonResult<T> {
    private int core;
    private String message;
    private T data;

    public CommonResult(int core, String message, T data) {
        this.core = core;
        this.message = message;
        this.data = data;
    }

    @Override
    public String toString() {
        return "CommonResult{" +
                "core=" + core +
                ", message='" + message + '\'' +
                ", data=" + data +
                '}';
    }

    public CommonResult() {
    }

    public int getCore() {
        return core;
    }

    public void setCore(int core) {
        this.core = core;
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


}
