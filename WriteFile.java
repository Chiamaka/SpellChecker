

import java.io.FileWriter;
import java.io.PrintWriter;
import java.io.IOException;


public class WriteFile {
	private String file_path;
	private boolean append_to_file = false;
	
	public WriteFile(String file_path) {
		this.file_path = file_path;
	}
	
	public WriteFile(String file_path, boolean append_to_file) {
		this.file_path = file_path;
		this.append_to_file = append_to_file;
	}
	
	public void writeFile(String textLine) throws IOException{
		FileWriter fw = new FileWriter(file_path, append_to_file);
		PrintWriter pw = new PrintWriter(fw);
		
		pw.printf("%s" + "%n", textLine);
		pw.close();
	}
	
//	public static void main(String[] args) throws IOException {
//		WriteFile rite = new WriteFile("document-corrected.txt");
//		rite.writeFile("thid id not eworking why?");
//	}
}	
