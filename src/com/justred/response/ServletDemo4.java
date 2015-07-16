package com.justred.response;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
//演示Content_type相应头
public class ServletDemo4 extends HttpServlet {

	public void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		String s = "一个人的武林";
		//通知浏览器的Content_Type
		response.setHeader("Content-Type", "text/html;charset=UTF-8");
		//getWriter()一个PrintWriter getWriter()
		response.getWriter().write(s);
	}

	public void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		doGet(request, response);
	}


}
