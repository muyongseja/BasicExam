package basic07;

import java.io.IOException;

import javax.inject.Inject;
import javax.inject.Named;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component("msgBean")
public class MessageBeanImpl implements MessageBean {
	@Value("홍길동")
	private String name;
	@Value("20")
	private int age;
	@Value("Hello")
	private String greeting;
	
	/*
	@Autowired(required=false)
	@Qualifier("fileOut")
	private Outputter out;
	*/
	
	/*
	@Autowired
	private Outputter out;
	*/
	
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
	
	/*
	@Autowired
	public void setOut(Outputter out) {
		this.out = out;
	}
	*/
	
	/*
	@Resource(name="fileOut")
	public void setOut(Outputter out) {
		this.out = out;
	}
	*/
	
	@Inject
	//@Named(value="serverOut")
	//@Named(value="serverOutputter")
	@Named(value="fileOut")
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




