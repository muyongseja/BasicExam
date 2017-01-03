package basic02;

public class App {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		MessageBeanKr bean = new MessageBeanKr();
		bean.sayHello("홍길동");
		
		MessageBeanEn bean2 = new MessageBeanEn();
		bean2.sayGreeting("Tom");
		*/
		
		MessageBean bean = new MessageBeanKr();
		bean.sayHello("홍길동");
		
		bean = new MessageBeanEn();
		bean.sayHello("Tom");
	}
}





