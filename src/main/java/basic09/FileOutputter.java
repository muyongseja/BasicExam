package basic09;

import java.io.FileWriter;
import java.io.IOException;

public class FileOutputter implements Outputter {
	private String filePath;
	
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



