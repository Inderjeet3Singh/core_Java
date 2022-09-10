package fileHandling;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class ForExample2 {

	// read from file
	public static void main(String[] args) throws IOException {

		FileReader fr = new FileReader("ex1.txt");
		// Creating BufferedReader object
		BufferedReader br = new BufferedReader(fr);
		// Initializing charCount, wordCount and lineCount to 0
		int lineCount = 0;
		int wordCount = 0;
		int charCount = 0;
		// Reading the first line into currentLine

		String currentLine = br.readLine();
		while (currentLine != null) {
			// Updating the lineCount
			lineCount++;

			// Getting number of words in currentLine
			String[] words = currentLine.split(" ");

			// Updating the wordCount
			wordCount = wordCount + words.length;

			// Iterating each word
			for (String word : words) {
				// Updating the charCount
				charCount = charCount + word.length();
			}
			currentLine = br.readLine();
		}

		System.out.println("number of chars in a file: " + charCount);
		System.out.println("number of words in a file: " + wordCount);
		System.out.println("number of lines in a file: " + lineCount);
		br.close();
		fr.close();

	}

}
