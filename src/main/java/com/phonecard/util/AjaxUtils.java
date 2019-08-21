package com.phonecard.util;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.http.HttpServletResponse;

//ajax������
//author tmac
//2017-08-01 10:00:00


public class AjaxUtils {

	private static final String HEADER_ENCODING = "UTF-8";
	
	public static void response(String contentType, String content,HttpServletResponse paraResponse){
		HttpServletResponse response = initResponseHeader(contentType, paraResponse);
		PrintWriter writer = null;
		try {
			writer = response.getWriter();
			writer.write(content);
			writer.flush();
		} catch (IOException e) {
			throw new RuntimeException(e.getMessage(), e);
		}
		finally{
			if(writer != null){
				writer.close();
			}
		}
	}

	public static void responseText(String text,HttpServletResponse response){
		response("text/plain", text, response);
	}

	public static void responseHtml(String html,HttpServletResponse response){
		response("text/html", html, response);
	}

	public static void responseXml(String xml,HttpServletResponse response){
		response("text/xml", xml, response);
	}

	public static void responseJson(String json,HttpServletResponse response){
		response("application/json", json, response);
	}
	
	/***
	 * ��ʼ����Ӧ��ͷ
	 * @param contentType ��������
	 * @param  ��ͷ��Ԥ������û��ʹ�ã�
	 * @return
	 */
	private static HttpServletResponse initResponseHeader(String contentType,HttpServletResponse response){
		String fullContentType = contentType + ";charset=" + HEADER_ENCODING;
		response.setContentType(fullContentType);
		return response;
	}

}
