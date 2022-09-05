package ch08;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class FileExceptionHandling {

	public static void main(String[] args) {
		
//		try - catch 문을 해서 오류 처리하기
//		try-catch-finally 문도 있음.
//		finally 안에는 파일을 닫거나 네트웤을 닫는 등의 리소스 해제 구현.
		
		
//		try {
//			예외가 발생할 수 있는 코드 부분
//		}catch(처리할 예외 타입 e) {
//			try 구문안에서 오류 발생 시 처리할 코드
//		}
//		
		
		
		
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





