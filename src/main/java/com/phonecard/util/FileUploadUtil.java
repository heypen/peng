package com.phonecard.util;

import java.io.File;

import javax.servlet.http.HttpServletRequest;

import org.springframework.web.multipart.MultipartFile;

import com.phonecard.config.PropertiesConfig;

/**
 * @Auther: mirror_huang
 * @Date: 2018/8/16 22:38
 * @QQ: 1755496180
 * @Description:
 */
public class FileUploadUtil {

    public static boolean fileUpload(MultipartFile file, HttpServletRequest request) throws Exception {
        //获取路径
        String pathRoot = PropertiesConfig.filePath;
        String path = "";
        if (!file.isEmpty()) {
            //生成uuid
            String uuid = UUIDGenerator.generate();
            //上传类型
            String contentType = file.getContentType();
            //上传后缀
            String imageName = contentType.substring(contentType.indexOf("/") + 1);
            //保存路径
            path = uuid + "." + imageName;
            System.out.println(pathRoot + path);
            File dest = new File(pathRoot + path);
            //判断文件父目录是否存在
            if (!dest.getParentFile().exists()) {
                dest.getParentFile().mkdir();
            }
            try {
                file.transferTo(new File(pathRoot + path));
                return true;
            } catch (Exception e) {
                e.printStackTrace();
                return false;
            }
        } else {
            return false;
        }
    }

    /**
     * 已生成文件名，保存文件
     *
     * @param file
     * @param fullName
     * @return
     * @throws Exception
     */
    public static boolean fileUpload(MultipartFile file, String fullName) throws Exception {
        //获取路径
        String pathRoot = PropertiesConfig.filePath;
        System.err.println("pathRoot"+pathRoot);
        File target = new File(pathRoot + fullName);
        
        if (!target.getParentFile().exists()) {
            //判断文件父目录是否存在
            target.getParentFile().mkdirs();
        }
        System.err.println("4");
        file.transferTo(target);
        System.err.println("6");
        return true;
    }
}

