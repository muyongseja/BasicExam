package basic03;

public class MessageBeanFactory {
	private MessageBeanFactory(){}
	private static MessageBeanFactory instance =
		new MessageBeanFactory();
	
	public static MessageBeanFactory newInstance(){
		return instance;
	}
	
	public MessageBean createMessage(String nation){
		if(nation.equals("kr")){
			return new MessageBeanKr();
		}
		else{
			return new MessageBeanEn();
		}
	}
}
