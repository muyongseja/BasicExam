package basic08;

import org.springframework.beans.factory.annotation.Value;

public class Sample {
	@Value("#{config.environment}")
	private String environment;
	@Value("#{config.getCountry()}")
	private String country;
	@Value("#{config.state}")
	private String state;
	@Value("#{config.splitName('John F Kenedy')}")
	private String[] splitName;
	
	public void display(){
		System.out.println(environment + " : " + country
			+ " : " + state + " : " + splitName[0]);
	}
}
