package com.justred.response;

import java.io.IOException;
import java.util.Random;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
//演示Refresh
public class ServletDemo5 extends HttpServlet {
	public void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		//隔一段时间刷新一下自己
		//response.setHeader("Refresh", "2");
		//response.getWriter().write("aa"+new Random().nextInt());
		
		//隔一段时间刷新到别的地方
		response.setHeader("Refresh","2;url=/day07_00_httpresponse/servlet/ServletDemo2");
	}

	public void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		doGet(request,response);
	}


}
