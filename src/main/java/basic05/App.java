package basic05;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ApplicationContext ctx = 
			new ClassPathXmlApplicationContext("classpath:basic05/basic05-config.xml");
		
		
	}
}





