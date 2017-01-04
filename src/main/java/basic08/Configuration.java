package basic08;

public class Configuration {
	public static String environment = "Development";
	
	public String getCountry(){
		return "America";
	}
	
	public String getState(){
		return "Newyork";
	}
	
	public String[] splitName(String name){
		return name.split(" ");
	}
}
