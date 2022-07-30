package ch08;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class FileExceptionHandling {

	public static void main(String[] args) {
		
//		FileInputStream fis = null;
		
		try(FileInputStream fis = new FileInputStream("a.txt"); ) {
//			fis = new FileInputStream("a.txt");
			System.out.println("reading..");
			// file 이 없을때
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			System.out.println(e);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} 	
		System.out.println("end");
	}
}

