import java.util.Random;
import java.io.*;
public class Application {

	public static void main(String[] args) throws StringTooLongException, FileNotFoundException {
		FileProcessor fp = new FileProcessor("BadString.txt",10);
		fp.processFile();
		FileProcessor fc = new FileProcessor("String1.txt",10);
		fp.processFile();
		
	
}}
