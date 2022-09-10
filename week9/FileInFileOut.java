

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;
import java.io.PrintWriter;
public class FileInFileOut {
	public static void main(String args[]) throws FileNotFoundException {
		Scanner input = new Scanner(new File("week9/integers.txt"));
		PrintWriter output = new PrintWriter("week9/reversedIntegers.txt");
		int lineNumber = 1;
		while(input.hasNextLine()){
			String line = input.nextLine();
			output.println("line " + lineNumber + " : " + line);
			lineNumber++;
	}       
	input.close();
	output.close();
    }   
}
