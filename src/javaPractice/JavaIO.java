package javaPractice;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class JavaIO {
	static String BASE_URL="C:\\Disk\\Work\\Coding\\JavaCodes\\src\\javaPractice\\";
	static void createFile(String filename) {
		File newFile=new File(BASE_URL+filename);
		try {
			if(newFile.createNewFile()) {
				System.out.println("File created successfully!!");
			}else {
				System.out.println("File with filename already exists!");
			}
		} catch (IOException e) {
			System.out.println("Error creating a file");
			e.printStackTrace();
		}
	}
	static void writeFile(String filename) {
		try {
			FileWriter writer = new FileWriter(BASE_URL+filename);
			writer.write("this is written from java code!!");
			writer.append("Another line!!");
			writer.close();
			System.out.println("Writter Successfully!!");
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	static void readFile(String filename) {
		//File file = new File("C:\\Disk\\Work\\Coding\\JavaCodes\\src\\javaPractice\\test.txt");
		File file = new File(BASE_URL+filename);
		try {
			System.out.println("Reading file....");
			Scanner inp = new Scanner(file);
			while(inp.hasNextLine()) {
				String data = inp.nextLine();
				System.out.println(data);
			}
			inp.close();
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	public static void main(String[] args) {
		
		Scanner in = new Scanner(System.in);
		
		System.out.println("Enter filename-");
		String filename=in.nextLine();
		
		//createFile(filename);
		//writeFile(filename);
		readFile(filename);
		in.close();
		

	}

}
