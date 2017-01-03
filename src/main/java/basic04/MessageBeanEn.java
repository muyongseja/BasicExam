package basic04;

public class MessageBeanEn implements MessageBean{
	@Override
	public void sayHello(String name){
		System.out.println("hello~~" + name);
	}
}
