package com.phonecard.util;

import java.util.UUID;

/**
 * @Auther: mirror_huang
 * @Date: 2018/8/6 0006 14:07
 * @QQ: 1755496180
 * @Description:生成不含-的全部小写的UUID
 */
public class UUIDUtil {

    public static String build(){
        return UUID.randomUUID().toString().replaceAll("-","").toLowerCase();
    }

}
