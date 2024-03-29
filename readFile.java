
import java.io.*;


public class readFile {
	private String file_path;
	
	public readFile(String file_path){
		this.file_path = file_path;
	}
	
	public String[] openFile() throws IOException {
		FileReader fr = new FileReader(file_path);
		BufferedReader br = new BufferedReader(fr);
		
		int numberOfLines = readLines();
		String[] words = new String[numberOfLines];
		
		for(int i=0; i<numberOfLines; i++) {
			words[i] = br.readLine();
		}
		
		br.close();
		return words;
	}
	
	int readLines() throws IOException {
		FileReader fr = new FileReader(file_path);
		BufferedReader br = new BufferedReader(fr);
		
		String aLine;
		int numberOfLines = 0;
		
		while((aLine = br.readLine()) != null) {
			numberOfLines++;
		}
		
		br.close();
		return numberOfLines;
		
	}
	
}
