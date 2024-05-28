package com.will.common.enums;

/**
 * @author Ziheng·Z
 * @date Created in 2020-03-10 11:42
 */
public enum LogEnum {


    /**
     * 业务日志
     */
    BUSINESS("business"),

    /**
     * 平台日志
     */
    PLATFORM("platform"),

    /**
     * 数据库日志
     */
    DB("db"),

    /**
     * 异常日志
     */
    EXCEPTION("exception");


    private String category;


    LogEnum(String category) {
        this.category = category;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }
}
