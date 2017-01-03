package basic06;

import java.io.IOException;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.BeanFactoryAware;
import org.springframework.beans.factory.BeanNameAware;
import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;

public class MessageBeanImpl implements MessageBean, InitializingBean, DisposableBean, BeanNameAware, BeanFactoryAware{
	private String name;
	private int age;
	private String greeting;
	private Outputter out;
	
	public MessageBeanImpl() {}
	public MessageBeanImpl(String name, int age, String greeting) {
		this.name = name;
		this.age = age;
		this.greeting = greeting;
		System.out.println("1. 빈의 생성자 호출");
	}
	
	public void setName(String name) {
		this.name = name;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public void setGreeting(String greeting) {
		this.greeting = greeting;
		System.out.println("2. setter 호출됨.");
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
	
	@Override
	public void setBeanFactory(BeanFactory arg0) throws BeansException {
		System.out.println("4. 빈의 팩토리 지정 : " + arg0.getClass());		
	}
	
	@Override
	public void setBeanName(String arg0) {
		System.out.println("3. 빈의 이름 지정 : " + arg0);
	}
	
	@Override
	public void destroy() throws Exception {
				
	}
	
	@Override
	public void afterPropertiesSet() throws Exception {
		System.out.println("6. 프로퍼티 지정 완료");		
	}
	
	public void messageInit(){
		System.out.println("7. 빈의 초기화");
	}
}




