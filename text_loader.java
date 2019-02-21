package text_reader;

import java.io.*;
import java.nio.charset.StandardCharsets;
import java.nio.file.*;

class text_loader {
	
	public static void main(String args[]) throws IOException {
		
			InputStream is = new FileInputStream("Z:\\Desktop\\git\\story.txt");
			BufferedReader buf = new BufferedReader(new InputStreamReader(is));
			
			String line = buf.readLine();
			StringBuilder sb = new StringBuilder();
			
			while(line != null) {
				sb.append(line).append("\n");
				line = buf.readLine();
				//line.replaceAll("[^A-Za-z]+", "");
			}
			
	        Files.lines(Paths.get("Z:\\Desktop\\git\\story.txt"), StandardCharsets.UTF_8).forEach(System.out::println);
	
	}

	
}
