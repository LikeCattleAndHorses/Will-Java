package com.mambazzh.common.exception;

/**
 * 自定义异常类
 *
 * @author Ziheng.Z
 * @date 16:18 2019-12-09
 */
public class ApiException extends RuntimeException {

    private static final long serialVersionUID = 1L;
    private int code = 400;
    private Object data;


    public static ApiException create(int code) {
        return new ApiException(code);
    }

    public static ApiException create(String message) {
        return new ApiException(message);
    }

    public static ApiException create(int code, String message) {
        return new ApiException(code, message);
    }

    public static ApiException create(String message, Exception rootCause) {
        return new ApiException(message, rootCause);
    }


    public static ApiException create(int code, String message, Exception rootCause) {
        return new ApiException(code, message, rootCause);
    }

    public static ApiException create(int code, String message, Object data) {
        return new ApiException(code, message, data);
    }

    private ApiException(int code) {
        this.code = code;
    }

    private ApiException(String message) {
        super(message);
    }

    private ApiException(int code, String message) {
        super(message);
        this.code = code;
    }


    private ApiException(String message, Exception rootCause) {
        super(message, rootCause);
    }

    private ApiException(int code, String message, Exception rootCause) {
        super(message, rootCause);
        this.code = code;
    }

    private ApiException(int code, String message, Object data) {
        super(message);
        this.code = code;
        this.data = data;
    }

    private int getCode() {
        return code;
    }

    private Object getData() {
        return data;
    }


}
