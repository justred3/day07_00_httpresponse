package com.justred.response;

import java.io.IOException;
import java.util.Random;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
//��ʾRefresh
public class ServletDemo5 extends HttpServlet {
	public void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		//��һ��ʱ��ˢ��һ���Լ�
		//response.setHeader("Refresh", "2");
		//response.getWriter().write("aa"+new Random().nextInt());
		
		//��һ��ʱ��ˢ�µ���ĵط�
		response.setHeader("Refresh","2;url=/day07_00_httpresponse/servlet/ServletDemo2");
	}

	public void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		doGet(request,response);
	}


}
