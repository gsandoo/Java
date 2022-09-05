package ch09;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class ThrowsException {
	
	public Class loadClass(String fileName, String className) throws ClassNotFoundException, IOException{
		FileInputStream fis = new FileInputStream("a.txt"); //FileNotFoundException 발생
		Class c = Class.forName(className);  //ClassNotFoundException 발생
		System.out.println(fis.read());//파일 내 문자 바이트 읽어오기
		
		return c;
	}

	public static void main(String[] args) {

		ThrowsException test = new ThrowsException();
		
		try {
			test.loadClass("a.txt", "java.lang.String");
		
		}catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}catch (Exception e) {
			e.printStackTrace();
		}
	}

	
	
}
