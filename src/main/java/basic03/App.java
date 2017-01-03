package basic03;

public class App {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MessageBeanFactory factory = MessageBeanFactory.newInstance();
		
		MessageBean bean = factory.createMessage("kr");
		bean.sayHello("홍길동");
		
		bean = factory.createMessage("en");
		bean.sayHello("Tom");
	}
}





