/**
 * Copyright (C), 2017-2019, 苏州立昌科技有限公司
 * FileName: KeyGenerateUtil
 * Author:   mirror_huang
 * Date:     2019/2/26 0026 16:16
 * Description: 生成id
 * History:
 * <author>          <qq>          <version>
 * mirror_huang     1755496180       版本号
 */
package com.phonecard.util;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Random;
import java.util.UUID;

/**
 * 〈一句话功能简述〉<br> 
 * 〈生成id〉
 *
 * @author mirror_huang
 * @create 2019/2/26 0026 16:16
 * @since 1.0.0
 */
public class KeyGenerateUtil {

    /**
     * uuid生成
     *
     * @return
     */
    public static String uuidGenerate() {
        return UUID.randomUUID().toString().replace("-", "").toLowerCase();
    }

    /**
     * 年份日期时间+随机四位数
     *
     * @return
     */
    public static String dateKeyGenerate() {
        LocalDateTime localDateTime = LocalDateTime.now();
        DateTimeFormatter dateTimeFormatter = DateTimeFormatter.ofPattern("yyyyMMddHHmmss");
        Random random = new Random();
        int randomNum = random.nextInt(9001) + 1000;
        return localDateTime.format(dateTimeFormatter) + randomNum;
    }

    public static String authCode6() {
        Random random = new Random();
        return String.valueOf(random.nextInt(899999) + 100000);
    }
}
