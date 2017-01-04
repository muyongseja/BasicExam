package basic07;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ApplicationContext ctx = 
			new ClassPathXmlApplicationContext("classpath:basic07/basic07-config.xml");
		
		MessageBean bean = (MessageBean)ctx.getBean("msgBean");
		bean.sayHello();
	}
}





