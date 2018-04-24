package service;

import javax.xml.ws.Endpoint;
//帮助网址（https://www.cnblogs.com/fengwenzhee/p/6915606.html）
//发布成功后浏览器中的访问地址(注意一定要加wsdl)：http://localhost:8080/WS_Server/WebServcie?wsdl
public class WebServicePublish {
	public static void main(String[] args) {
		
		String address="http://localhost:8080/WS_Server/WebServcie";
		
		//其实为的模拟器就是拿到实现类来发布，然后在客户端（另一个项目）中调用方法
		Endpoint.publish(address, new WebServcieImpl());
		
		System.out.println("webservice发布成功！");
	}
}
