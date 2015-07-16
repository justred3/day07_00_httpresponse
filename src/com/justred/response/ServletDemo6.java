package com.justred.response;

import java.io.FileInputStream;
import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.ServletOutputStream;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
//��ʾ��ӦͷContent-Disposition
public class ServletDemo6 extends HttpServlet {

	
	public void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		//�õ�ͼƬ��·��
		String path= this.getServletContext().getRealPath("/WEB-INF/classes/1.gif");
		System.out.println(path);
		
		//����һ������������
		FileInputStream is = new FileInputStream(path);
		byte[] bs = new byte[1024];
		int b = 0;
		//����һ�����������
		ServletOutputStream os = response.getOutputStream();
		
		//֪ͨ�����������ֱ����ʾ������Ҫ��������
		response.setHeader("Content-Disposition","attachment;filename=iverson.gif");
		
		//�������ݷ�������
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
