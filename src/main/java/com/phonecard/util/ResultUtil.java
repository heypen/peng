/**
 * Copyright (C), 2017-2019, 苏州立昌科技有限公司
 * FileName: ResultUtil
 * Author:   mirror_huang
 * Date:     2019/2/26 0026 09:38
 * Description: 结果封装
 * History:
 * <author>          <qq>          <version>
 * mirror_huang     1755496180       版本号
 */
package com.phonecard.util;


import com.phonecard.bean.ResultVO;

/**
 * 〈一句话功能简述〉<br> 
 * 〈结果封装〉
 *
 * @author mirror_huang
 * @create 2019/2/26 0026 09:38
 * @since 1.0.0
 */
public class ResultUtil {
    public static ResultVO success(Object object){
        ResultVO resultVO = new ResultVO();
        resultVO.setData(object);
        resultVO.setResult(0);
        resultVO.setMsg("请求成功");
        return resultVO;
    }

    public static ResultVO success(Object object,String msg){
        ResultVO resultVO = new ResultVO();
        resultVO.setData(object);
        resultVO.setResult(0);
        resultVO.setMsg(msg);
        return resultVO;
    }

    public static ResultVO success(){
        return success(null);
    }

    public static ResultVO fail(String msg){
        ResultVO resultVO = new ResultVO();
        resultVO.setResult(1);
        resultVO.setMsg(msg);
        return resultVO;
    }

    public static ResultVO set(Integer code,String msg){
        ResultVO resultVO = new ResultVO();
        resultVO.setResult(code);
        resultVO.setMsg(msg);
        return resultVO;
    }

}
