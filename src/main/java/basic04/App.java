package basic04;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ApplicationContext ctx = 
			new ClassPathXmlApplicationContext("classpath:basic04/basic04-config.xml");
		
		MessageBean bean = (MessageBean)ctx.getBean("msgKr");
		bean.sayHello("홍길동");
		
		bean = (MessageBean)ctx.getBean("msgEn");
		bean.sayHello("Tom");
		
		bean = ctx.getBean("kr", MessageBean.class);
		bean.sayHello("임꺽정");
		
		bean = ctx.getBean("korea", MessageBean.class);
		bean.sayHello("신돌석");
	}
}





