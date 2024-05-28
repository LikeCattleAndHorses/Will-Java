package com.will;


import com.google.common.cache.Cache;
import com.google.common.cache.CacheBuilder;

import java.util.concurrent.TimeUnit;

/**
 * @author MambaZzh
 * @date 16:29 2020-05-23
 */
public class LocalCacheTest {
    public static void main(String[] args) {
//        构建本地缓存，设置过期时间20s
        Cache<Object, Object> build = CacheBuilder.newBuilder().expireAfterWrite(20, TimeUnit.MINUTES).build();
        build.put("本地缓存", "本地缓存数据");
        Object value = build.getIfPresent("本地缓存");
        System.out.println(value);
    }
}
