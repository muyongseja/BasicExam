package basic07;

import java.io.IOException;

import org.springframework.stereotype.Component;

@Component("serverOut")
public class ServerOutputter implements Outputter{
	@Override
	public void output(String msg) throws IOException {
		System.out.println("서버로 출력");
	}
}
