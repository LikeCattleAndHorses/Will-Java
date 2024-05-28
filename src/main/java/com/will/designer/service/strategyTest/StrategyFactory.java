package com.will.designer.service.strategyTest;

import cn.hutool.core.lang.Assert;
import com.will.common.util.LogUtil;
import org.springframework.beans.factory.InitializingBean;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/**
 * @author MambaZzh
 * @date 16:49 2020-05-23
 */
@Service
public class StrategyFactory implements InitializingBean {


    @Autowired
    private Map<String, StrategyCenter> strategies = new ConcurrentHashMap<>();

    public StrategyCenter getStrategy(String label) {
        StrategyCenter strategy = strategies.get(label);
        Assert.notNull(strategy, "工厂内未找到策略实例");
        return strategy;
    }

    @Override
    public void afterPropertiesSet() throws Exception {
        LogUtil.getPlatformLogger();
    }
}
