package com.will.designer.service.strategyTest;

import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.InitializingBean;
import org.springframework.stereotype.Component;

/**
 * @author MambaZzh
 * @date 16:57 2020-05-23
 */
@Component
@Slf4j
public class Test implements StrategyCenter, InitializingBean {
    @Override
    public String CalculationLogic(String label) {
        return null;
    }

    @Override
    public void afterPropertiesSet() throws Exception {
     log.info("test装配");
    }
}
