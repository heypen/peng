package com.phonecard.util;

import java.io.IOException;

import org.springframework.web.multipart.MultipartFile;

import com.qiniu.common.QiniuException;
import com.qiniu.common.Zone;
import com.qiniu.http.Response;
import com.qiniu.storage.BucketManager;
import com.qiniu.storage.Configuration;
import com.qiniu.storage.UploadManager;
import com.qiniu.util.Auth;

/**
 * 上传七牛云
 * @author Administrator
 *
 */

public class QiniuyunUtils {
	
	// 设置好账号的ACCESS_KEY和SECRET_KEY
	String ACCESS_KEY = "9AxsR2vSxFW_SmrvS95XcM9vfxM-dTvd6IbVHvUH";
	String SECRET_KEY = "Tugk2f86XZ1CCuZzEFFWuyiV71PyMlmG84j4Rkob";
	// 要上传的空间--
	String bucketname = "file";

	// 密钥配置
	Auth auth = Auth.create(ACCESS_KEY, SECRET_KEY);
	// 创建上传对象
	Configuration c = new Configuration(Zone.zone0());
	UploadManager uploadManager = new UploadManager(c);

	// 简单上传，使用默认策略，只需要设置上传的空间名就可以了
	public String getUpToken() {
		// return auth.uploadToken(bucketname, null, 7200, null);
		return auth.uploadToken(bucketname, null, 7200, null, true);
		// return uptoken;
	}

	public Boolean upload(byte[] file, String key) throws IOException {
		Boolean flag = false;
		try {
			// 调用put方法上传
			Response res = uploadManager.put(file, key, getUpToken());
			// 打印返回的信息
			System.out
					.println("返回的Response res = uploadManager.put(file, key, getUpToken());的值为：=="
							+ res.bodyString());
			if (res != null) {
				flag = true;
			}
		} catch (QiniuException e) {
			Response r = e.response;
			// 请求失败时打印的异常的信息
			System.out.println(r.toString());
			try {
				// 响应的文本信息
				System.out.println(r.bodyString());
			} catch (QiniuException e1) {
				// ignore
			}
		}
		return flag;
	}

	/**
	 * 上传文件
	 * 
	 * @param file
	 *            byte
	 * @param key
	 *            文件名
	 * @throws Exception
	 */
	public Boolean uploadFile(byte[] file, String key) throws Exception {
		Boolean flag = new QiniuyunUtils().upload(file, key);
		return flag;
	}

	/**
	 * 删除文件
	 * 
	 * @param key
	 *            要删除文件名
	 * @return
	 */
	public Boolean deleteFile(String key) {
		// 构造一个带指定Zone对象的配置类
		Configuration cfg = new Configuration(Zone.zone0());
		// ...其他参数参考类注释
		BucketManager bucketManager = new BucketManager(auth, cfg);
		try {
			bucketManager.delete(bucketname, key);
			return true;
		} catch (QiniuException ex) {
			// 如果遇到异常，说明删除失败
			System.err.println(ex.code());
			System.err.println(ex.response.toString());
			return false;
		}
	}
	// 创建上传对象
    public Boolean upload(MultipartFile multipartFile, String key) throws Exception {
        //上传配置
        Configuration c = new Configuration(Zone.zone0());
        // 创建上传对象
        UploadManager uploadManager = new UploadManager(c);
        // 简单上传，使用默认策略，只需要设置上传的空间名就可以了
        String upToken = auth.uploadToken(bucketname, null, 7200, null, true);
        Boolean flag = false;
        try {
            byte[] file = multipartFile.getBytes();
            // 调用put方法上传
            Response res = uploadManager.put(file, key, upToken);
            if (res != null) {
                flag = true;
            }
        } catch (QiniuException e) {
            Response r = e.response;
        }
        return flag;
   }
}
