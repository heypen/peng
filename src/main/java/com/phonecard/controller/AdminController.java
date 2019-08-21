package com.phonecard.controller;

import io.swagger.annotations.Api;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.phonecard.bean.Admin;
import com.phonecard.bean.JsonResult;
import com.phonecard.service.AdminService;
import com.phonecard.service.RedisService;
import com.phonecard.util.PageObject;
import com.phonecard.util.StatusCode;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiParam;
/**
 * @Auther: Mr.Yang
 * @Date: 2019/8/21 0021 15:41
 * @Description:
 */

@Api(value = "管理员管理" , tags = {"管理员管理"})
@RestController
public class AdminController {

    @Autowired
    private AdminService adminService;
    @Autowired
    private RedisService redisService;

    @ApiOperation(value = "管理员列表" , notes = "管理员列表")
    @RequestMapping(value = "getAdminList" , method = RequestMethod.POST)
    public JsonResult getAdminList(@ApiParam(value = "分页信息")@RequestBody PageObject pageObject) {
        JsonResult r = new JsonResult();
        try {
            Map<String, Object> map = adminService.getAdminList(pageObject);
            r.setData(map);
            r.setResult(StatusCode.SUCCESS);
            r.setMsg("OK");
        } catch (Exception e) {
            r.setMsg(e.getClass().getName() + ":" + e.getMessage());
            r.setResult(StatusCode.FAIL);
            e.printStackTrace();
        }
        return r;
    }

    @ApiOperation(value = "重置密码" , notes = "重置密码")
    @RequestMapping(value = "changePassWord" , method = RequestMethod.POST)
    public JsonResult changePassWord(HttpServletRequest request, @RequestParam Integer id) {
        String token = request.getHeader("x-access-token");
        Admin superAdmin = (Admin) redisService.get(token);
        if(superAdmin.getIsSuper() == 1) {
            return adminService.changPassWord(id);
        }else {
            return new JsonResult(StatusCode.FAIL,"你不是超级管理员，不能重置密码管理员!");
        }
    }
    @ApiOperation(value = "禁用" , notes = "禁用")
    @RequestMapping(value = "changeStop" , method = RequestMethod.POST)
    public JsonResult changeStop(HttpServletRequest request, @RequestBody Admin admin) {
        String token = request.getHeader("x-access-token");
        Admin superAdmin =(Admin) redisService.get(token);
        if(superAdmin.getIsSuper() == 1) {
            return adminService.changStop(admin);
        }else {
            return new JsonResult(StatusCode.FAIL,"你不是超级管理员，不能禁用管理员!");
        }
    }

    @ApiOperation(value = "删除" , notes = "删除")
    @RequestMapping(value = "delete" , method = RequestMethod.POST)
    public JsonResult delete(HttpServletRequest request, @RequestParam Integer id) {
        String token = request.getHeader("x-access-token");
        Admin superAdmin = (Admin) redisService.get(token);
        if(superAdmin.getIsSuper() == 1) {
            return adminService.delete(id);
        }else {
            return new JsonResult(StatusCode.FAIL,"你不是超级管理员，不能删除管理员!");
        }
    }
    @ApiOperation(value = "新增管理员",notes = "新增管理员")
    @RequestMapping(value = "add" , method = RequestMethod.POST)
    public JsonResult addAdmin(HttpServletRequest request, @RequestBody Admin admin) {
        String token = request.getHeader("x-access-token");
        Admin superAdmin = (Admin) redisService.get(token);
        if(superAdmin.getIsSuper() == 1) {
            return adminService.addAdmin(admin);
        }else {
            return new JsonResult(StatusCode.FAIL,"你不是超级管理员，不能增加管理员!");
        }
    }

}
