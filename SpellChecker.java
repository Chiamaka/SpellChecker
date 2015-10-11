

import java.io.IOException;
import java.util.Arrays;
import java.util.Scanner;
import java.io.*;

public class SpellChecker {

	public static void main(String[] args) throws IOException{
		
		String file_name = args[0];
		String dictionary = args[1];
		readFile file = new readFile(file_name);
		readFile dict = new readFile(dictionary);
		WriteFile wfile = new WriteFile("document-corrected.txt", true);

		BinarySearch binsearch = new BinarySearch();
		String[] array = file.openFile();
		String[] dictArray = dict.openFile();
		String[] words;

		
		for(String a : array){
			words = a.split(" ");
			//System.out.println(Arrays.toString(words));
			
			for(String x : words){
				wfile.writeFile(binsearch.search(dictArray, x));

			}

		}
		System.out.println("file created");
	}

}


