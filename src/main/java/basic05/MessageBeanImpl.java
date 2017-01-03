package basic05;

public class MessageBeanImpl implements MessageBean {
	private String name;
	private int age;
	private String greeting;
	
	@Override
	public void sayHello() {
		String msg = greeting + "~~" + name + "! 이제 당신은 "
			+ age + "살 입니다.";
		System.out.println(msg);
	}
}
