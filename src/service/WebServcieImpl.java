package service;

@javax.jws.WebService
public class WebServcieImpl implements WebServcie{

	@Override
	public String sayHello(String name) {
		System.out.println("这是接口的实现类，提供给模拟器测试用的");
		return name+"恭喜调用接口成功";
	}

}
