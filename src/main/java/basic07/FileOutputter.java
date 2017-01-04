package basic07;

import java.io.FileWriter;
import java.io.IOException;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component("fileOut")
public class FileOutputter implements Outputter {
	private String filePath;
	
	@Value("c:\\netsong7\\messageBean.txt")
	public void setFilePath(String filePath) {
		this.filePath = filePath;
	}

	@Override
	public void output(String msg) throws IOException {
		FileWriter writer = new FileWriter(filePath);
		writer.write(msg);
		writer.close();
	}
}



