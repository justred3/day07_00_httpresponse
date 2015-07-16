package com.justred.response;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
//响应头演示Expires
public class ServletDemo7 extends HttpServlet {

	
	public void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		//通知浏览器不要用缓存
		response.setHeader("Expires", "-1");
		response.setHeader("Cache-control","no-cache");
		response.setHeader("Pragma","no-cache");
		response.getWriter().write("hello World!");
		
	}

	
	public void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		
	}

}
