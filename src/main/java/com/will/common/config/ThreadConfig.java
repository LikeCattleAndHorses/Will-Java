package com.will.common.config;

import lombok.extern.slf4j.Slf4j;

import org.springframework.aop.interceptor.AsyncUncaughtExceptionHandler;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.scheduling.annotation.AsyncConfigurer;
import org.springframework.scheduling.annotation.EnableAsync;
import org.springframework.scheduling.concurrent.ThreadPoolTaskExecutor;

import java.lang.reflect.Method;
import java.util.concurrent.Executor;

/**
 * 配置类实现AsyncConfigurer接口并重写AsyncConfigurer方法，并返回一个ThreadPoolTaskExecutor
 * 这样我们就得到了一个基于线程池的TaskExecutor
 *
 * @author Ziheng·Z
 * @date Created in 2020-03-10 10:34
 * @EnableAsync：开启异步支持
 */
@Configuration
@EnableAsync
@Slf4j
public class ThreadConfig implements AsyncConfigurer {

    @Bean
    @Override
    public Executor getAsyncExecutor() {
        ThreadPoolTaskExecutor taskExecutor = new ThreadPoolTaskExecutor();
//        返回可用处理器的Java虚拟机的数量
        int core = Runtime.getRuntime().availableProcessors();
//        线程池核心线程数量
        taskExecutor.setCorePoolSize(core);
//        线程池最线程数量
        taskExecutor.setMaxPoolSize((core << 1) + core);
//        线程池等待队列数量
        taskExecutor.setQueueCapacity(100);
//        线程名称前缀
        taskExecutor.setThreadNamePrefix("Mamba-Thread-");
        taskExecutor.initialize();
        return taskExecutor;
    }

    /**
     * 异步任务中异常处理
     *
     * @return
     */
    @Override
    public AsyncUncaughtExceptionHandler getAsyncUncaughtExceptionHandler() {
        return new SpringAsyncExceptionHandler();
    }

    private class SpringAsyncExceptionHandler implements AsyncUncaughtExceptionHandler {

        @Override
        public void handleUncaughtException(Throwable ex, Method method, Object... params) {
            log.info("--------------------multi thread exception--------------------");
        }
    }
}
