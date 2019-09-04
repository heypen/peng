package com.phonecard.util;


import com.phonecard.config.PropertiesConfig;
import org.springframework.web.multipart.MultipartFile;

import javax.servlet.http.HttpServletRequest;
import java.io.File;
import java.util.regex.Pattern;

/**
 * @Author: mirror_huang
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
            String uuid = KeyGenerateUtil.uuidGenerate();
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
        File target = new File(pathRoot + fullName);
        if (!target.getParentFile().exists()) {
            //判断文件父目录是否存在
            target.getParentFile().mkdirs();
        }
        file.transferTo(target);
        return true;
    }

    public static Short getFileType(String ext){
        String reg = "(mp4|flv|avi|rm|rmvb|wmv|mov|swf|mpeg|mpg)";

        Pattern p = Pattern.compile(reg);
        boolean boo = p.matcher(ext).find();
        if(boo){
            return 1;
        }else {
            return 2;
        }
    }
}

