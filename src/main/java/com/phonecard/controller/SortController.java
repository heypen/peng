package com.phonecard.controller;

import com.phonecard.bean.JsonResult;
import com.phonecard.bean.OneSort;
import com.phonecard.service.SortService;
import com.phonecard.util.PageObject;
import com.phonecard.util.StatusCode;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiParam;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.List;
import java.util.Map;


/**
 * @Auther: Mr.Yang
 * @Date: 2019/8/22 0022 16:34
 * @Description:
 */
@Api(tags = {"分类管理"})
@RestController
public class SortController {

    @Autowired
    private SortService sortService;

    @ApiOperation(value = "查看一级分类信息" , notes = "查看一级分类信息")
    @RequestMapping(value = "findProgram" , method = RequestMethod.POST)
    public JsonResult findOneSort() {
        JsonResult r = sortService.findOneSort();
        return r;
    }

    @ApiOperation(value = "更新一级分类信息" , notes = "更新一级分类信息")
    @RequestMapping(value = "findProgram" , method = RequestMethod.POST)
    public JsonResult updateOneSort(@ApiParam(value = "一级分类信息") @RequestBody OneSort oneSort) {
        JsonResult r = sortService.updateOneSort(oneSort);
        return r;
    }

    @ApiOperation(value = "删除一级分类信息" , notes = "删除一级分类信息")
    @RequestMapping(value = "findProgram" , method = RequestMethod.POST)
    public JsonResult deleteOneSort(@ApiParam(value = "一级分类id") @RequestParam("id") Integer id) {
        JsonResult r = sortService.deleteOneSort(id);
        return r;
    }

}
