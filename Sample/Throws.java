package Sample;

import java.io.IOException;

public class Throws {
	public static void findFile()throws IOException,ArithmeticException{
		throw new IOException("File not found");
	}
public static void main(String args[]) {
try {	

	findFile();
	System.out.println("Rest of code in try block");
}
catch (IOException e) {
	System.out.println(e.getMessage());
}
}
}