package com.zhangmc.utils;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.TypeReference;


/**
 * @author zhangMC
 * @description
 * @date 2022/05/13 17:23
 **/
public class DataUtil<T> {

    /**
     * json字符串转对象
     * @param value 字符串
     * @param type 类型
     * @param <T> 泛型
     * @return 对象
     */
    public static <T> T toObject(String value, TypeReference<T> type) {
        return JSON.parseObject(value, type);
    }

    /**
     * 对象转json字符串
     * @param t t
     * @param <T> 泛型
     * @return 字符串
     */
    public static <T> String toJsonString(T t){
        return JSON.toJSONString(t);
    }
}
