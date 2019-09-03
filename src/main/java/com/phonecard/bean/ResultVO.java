/**
 * Copyright (C), 2017-2019, 苏州立昌科技有限公司
 * FileName: ResultVO
 * Author:   mirror_huang
 * Date:     2019/2/26 0026 09:41
 * Description: 返回结果model
 * History:
 * <author>          <qq>          <version>
 * mirror_huang     1755496180       版本号
 */
package com.phonecard.bean;

import lombok.Data;

/**
 * 〈一句话功能简述〉<br> 
 * 〈返回结果model〉
 *
 * @author mirror_huang
 * @create 2019/2/26 0026 09:41
 * @since 1.0.0
 */

@Data
public class ResultVO<T> {
    private Integer result;

    private T data;

    private String msg;


}
