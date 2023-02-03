package com.mambazzh.common.util;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import com.mambazzh.common.enums.LogEnum;

/**
 * 本地日志参考类
 *
 * @author Ziheng·Z
 * @date Created in 2020-03-10 11:41
 */
public class LogUtil {
    /**
     * 获取业务日志logger
     *
     * @return
     */
    public static Logger getBusinessLogger() {
        return LoggerFactory.getLogger(LogEnum.BUSINESS.getCategory());
    }

    /**
     * 获取平台日志logger
     *
     * @return
     */
    public static Logger getPlatformLogger() {
        return LoggerFactory.getLogger(LogEnum.PLATFORM.getCategory());
    }

    /**
     * 获取数据库日志logger
     *
     * @return
     */
    public static Logger getDBLogger() {
        return LoggerFactory.getLogger(LogEnum.DB.getCategory());
    }

    /**
     * 获取异常日志logger
     *
     * @return
     */
    public static Logger getExceptionLogger() {
        return LoggerFactory.getLogger(LogEnum.EXCEPTION.getCategory());
    }
}
