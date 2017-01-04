package basic07;

import java.io.IOException;

import javax.inject.Named;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Named("serverOut")
@Scope("prototype")
public class ServerOutputter implements Outputter{
	@Override
	public void output(String msg) throws IOException {
		System.out.println("서버로 출력");
	}
}
