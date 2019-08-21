package com.phonecard.service;

/**
 * @Auther: Mr.Yang
 * @Date: 2019/8/21 0021 15:47
 * @Description:
 */
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.phonecard.bean.Admin;
import com.phonecard.bean.JsonResult;
import com.phonecard.dao.AdminMapper;
import com.phonecard.util.MD5Password;
import com.phonecard.util.PageObject;
import com.phonecard.util.StatusCode;

@Service
public class AdminService {

    @Autowired
    private AdminMapper adminMapper;

    public Admin checkUserInfo(Admin loginAdmin) {
        System.out.println("1111111111111111");
        return adminMapper.getAdmin(loginAdmin);
    }

    public Map<String, Object> getAdminList(PageObject pageObject) {
        pageObject.setRowCount(adminMapper.getCountAdminSum());
        List<Admin> list = adminMapper.getAdminList(pageObject);
        for (Admin admin : list) {
            admin.setPassword(null);
        }
        Map<String, Object> map = new HashMap<>();
        map.put("page", pageObject);
        map.put("info", list);
        return map;
    }

    /**
     * 重置密码
     *
     * @param id
     * @return
     */
    public JsonResult changPassWord(Integer id) {
        String rPassWord = MD5Password.MD5("123456");
        int count = adminMapper.getChangPassWord(id, rPassWord);
        if (count >= 1) {
            return new JsonResult(StatusCode.SUCCESS, "修改成功！");
        } else {
            return new JsonResult(StatusCode.FAIL, "修改失败！");
        }
    }

    /**
     * 禁用
     *
     * @param admin
     * @return
     */
    public JsonResult changStop(Admin admin) {

        Admin superAdmin = adminMapper.selectByPrimaryKey(admin.getId());
        if (superAdmin.getIsSuper() == 1) {
            return new JsonResult(StatusCode.FAIL, "超级管理员不能禁用！");
        }
        int count = adminMapper.getchangeStop(admin);
        if (count > 0) {
            return new JsonResult(StatusCode.SUCCESS, "修改成功!");
        }
        return new JsonResult(StatusCode.FAIL, "请稍后再试...");
    }

    /**
     * 删除
     *
     * @param id
     * @return
     */

    public JsonResult delete(Integer id) {
        Admin admin = adminMapper.selectByPrimaryKey(id);
        if (admin.getIsSuper() == 1) {
            return new JsonResult(StatusCode.FAIL, "超级管理员不能删除！");
        }
        int count = adminMapper.updataDelete(id);
        if (count > 0) {
            return new JsonResult(StatusCode.SUCCESS, "删除成功!");
        }
        return new JsonResult(StatusCode.FAIL, "请稍后再试...");
    }

    /**
     * 新增管理员
     *
     * @param admin
     * @return
     */
    public JsonResult addAdmin(Admin admin) {
        int row = adminMapper.findAdminName(admin.getAccount());
        if(row > 0) {
            return new JsonResult(StatusCode.FAIL,"用户名已存在");
        }
        admin.setPassword(MD5Password.MD5(admin.getPassword()));
        admin.setIsSuper((short)0);
        admin.setCreateTime(new Date());
        int count = adminMapper.insertSelective(admin);
        if(count > 0) {
            return new JsonResult(StatusCode.SUCCESS,"新增成功！");
        }else {
            return new JsonResult(StatusCode.FAIL,"请稍后再试...");
        }
    }

}
