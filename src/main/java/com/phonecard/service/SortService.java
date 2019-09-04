package com.phonecard.service;

import com.phonecard.bean.JsonResult;
import com.phonecard.bean.OneSort;
import com.phonecard.dao.OneSortMapper;
import com.phonecard.util.StatusCode;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @Auther: Mr.Yang
 * @Date: 2019/8/22 0022 16:35
 * @Description:
 */
@Service
public class SortService {

    @Autowired
    private OneSortMapper oneSortMapper;

    public JsonResult findOneSort() {
        JsonResult r = new JsonResult();
        List<OneSort> list = oneSortMapper.findOneSort();
        r.setData(list);
        r.setMsg("OK");
        r.setResult(StatusCode.SUCCESS);
        return r;
    }


    public JsonResult updateOneSort(OneSort oneSort) {
        JsonResult r = new JsonResult();
        int row = oneSortMapper.updateByPrimaryKeySelective(oneSort);
        if (row > 0){
            r.setMsg("更新成功");
            r.setResult(StatusCode.SUCCESS);
        }else {
            r.setMsg("更新失败");
            r.setResult(StatusCode.FAIL);
        }
        return r;
    }

}
