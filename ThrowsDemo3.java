package example;

import java.io.FileNotFoundException;
import java.io.FileReader;

public class ThrowsDemo3 {
	static void readData() throws FileNotFoundException{
		FileReader f=new FileReader("dinga.txt");
	}
	public static void main(String[] args) {
		try {
			readData();
		}
		catch(FileNotFoundException e) {
		System.out.println(e.getMessage());
		}
	}

}
