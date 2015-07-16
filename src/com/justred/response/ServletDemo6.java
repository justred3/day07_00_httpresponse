package com.justred.response;

import java.io.FileInputStream;
import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.ServletOutputStream;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
//演示响应头Content-Disposition
public class ServletDemo6 extends HttpServlet {

	
	public void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		//拿到图片的路径
		String path= this.getServletContext().getRealPath("/WEB-INF/classes/1.gif");
		System.out.println(path);
		
		//创建一个输入流对象
		FileInputStream is = new FileInputStream(path);
		byte[] bs = new byte[1024];
		int b = 0;
		//创建一个输出流对象
		ServletOutputStream os = response.getOutputStream();
		
		//通知浏览器不是用直接显示，而是要下载下来
		response.setHeader("Content-Disposition","attachment;filename=iverson.gif");
		
		//读出数据发送数据
		while((b=is.read(bs))!=-1){
			os.write(bs,0,b);
		}
		os.close();
		is.close();
	}

	
	public void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

	}
}
