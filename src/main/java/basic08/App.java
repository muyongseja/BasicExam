package basic08;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App {
	public static void main(String[] args) {
		ApplicationContext ctx = 
			new ClassPathXmlApplicationContext("classpath:basic08/basic08-config.xml");
		
		Sample sample = (Sample)ctx.getBean("sample");
		sample.display();
	}
}
