package com.dream.dao.utils;

public enum ResponseCode {

    OK(200, "操作成功"),
    PARAM(30002, "参数错误"),
    SYSTEM_FAIL(1002, "系统异常");

    ResponseCode(int code,String msg) {
        this.code = code;
        this.msg = msg;
    }

    private int code;
    private String msg;

    public int getCode() {
        return this.code;
    }

    public int getCode(int code) {
       return this.code = code;
    }

    public String getMsg() {
        return this.msg;
    }

    public String getMsg(String msg) {
        return this.msg = msg;
    }
}
