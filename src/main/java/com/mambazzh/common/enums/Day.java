package com.mambazzh.demo;

public enum Day {

    SUN("SUN", "星期天"),

    MON("MON", "星期一"),

    TUES("TUES", "星期二"),

    WED("WED", "星期三"),

    THUR("THUR", "星期四"),

    FRI("FRI", "星期五"),

    SAT("SAT", "星期六");

    private final String code;
    private final String description;

    public String getCode() {
        return code;
    }

    public String getDescription() {
        return description;
    }

    Day(String code, String description) {
        this.code = code;
        this.description = description;
    }
}
