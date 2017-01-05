package basic09;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class AppConfiguration {
	@Bean
	public MessageBean getMessageBean(){
		MessageBeanImpl bean = new MessageBeanImpl();
		
		FileOutputter output = new FileOutputter();
		output.setFilePath("c:\\netsong7\\messagebean.txt");
		
		bean.setAge(20);
		bean.setGreeting("안녕하세요");
		bean.setName("신돌석");
		bean.setOut(output);
		return bean;
	}
}
