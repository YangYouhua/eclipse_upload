
package service;

import javax.jws.WebMethod;
/**
 * 这是WebService接口，其中定义了一个sayHello(String name)的方法
 * @author yyh
 *
 */
@javax.jws.WebService
public interface WebServcie {

	@WebMethod
	String sayHello(String name);
}
