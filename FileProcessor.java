
import java.util.ArrayList;
import java.util.Scanner;
import java.io.*;
public class FileProcessor {
	private String fileName;
	private int stringLength;
	private ArrayList <String> stringList;
	public FileProcessor(String fileName, int stringLength) {
		fileName = "";
		stringLength = 5;
			
	}//end empty-argument constructor
	
	public int getArrayListSize() {
		return stringLength;
	}//end getArrayListSize
	
	public void processFile() throws StringTooLongException, FileNotFoundException{
		
		try {
				File text = new File("BadString.txt");
				Scanner scan = new Scanner(text);
				String word;
				while(scan.hasNext()) 
				{
					 word = scan.nextLine();
				if(word.length()>stringLength)
					throw new StringTooLongException("String Too Long");
					System.out.println("File line: ");
				}
			}
		catch (StringTooLongException e	) {
			System.out.println(e.toString());
	}
		try {
			File text = new File("String1.txt");
			Scanner scan = new Scanner(text);
			String word;
			while(scan.hasNext()) 
			{
				 word = scan.nextLine();
			if(word.length()<stringLength)
				throw new FileNotFoundException("No File Found");
				System.out.println("File line: ");
			}
		}
	catch (FileNotFoundException f) {
		System.out.println(f.toString());
}
		
	}
		
		//end processFile
	public String getFileName() {
		return fileName;
	}
	public int getStringLength() {
		return stringLength;
	}

	public void setFileName(String fileName) {
		this.fileName = "";
	}

	public void setStringLength(int stringLength) {
		this.stringLength = stringLength ;
	}
	public void setArrayListSize() {
		this.stringList = stringList;
	}
	
}//end class

