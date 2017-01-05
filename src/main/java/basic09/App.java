package basic09;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import basic09.MessageBean;

public class App {
	public static void main(String[] args) {
			ApplicationContext ctx =
				new AnnotationConfigApplicationContext(AppConfiguration.class);
			
			MessageBean bean = (MessageBean)ctx.getBean("getMessageBean");
			bean.sayHello();
	}
}
