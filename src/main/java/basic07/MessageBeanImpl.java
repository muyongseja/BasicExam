package basic07;

import java.io.IOException;
import org.springframework.beans.BeansException;
import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.BeanFactoryAware;
import org.springframework.beans.factory.BeanNameAware;
import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;

public class MessageBeanImpl implements MessageBean {
	private String name;
	private int age;
	private String greeting;
	private Outputter out;
	
	public MessageBeanImpl() {}
	public MessageBeanImpl(String name, int age, String greeting) {
		this.name = name;
		this.age = age;
		this.greeting = greeting;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public void setGreeting(String greeting) {
		this.greeting = greeting;
	}
	
	
	public void setOut(Outputter out) {
		this.out = out;
	}
	
	@Override
	public void sayHello() {
		String msg = greeting + "~~" + name + "! 이제 당신은 "
			+ age + "살 입니다.";
		System.out.println(msg);
		
		try {
			out.output(msg);
		} 
		catch (IOException e) {
			e.printStackTrace();
		}
	}
}




