package ch23;


import java.util.ArrayList;
import ch21.Book;


public class ArrayListTest {

	public static void main(String[] args) {
		
		ArrayList <Book>  library  = new ArrayList<>();
		
		library.add(new Book("태백산맥1" , "조정해"));
		library.add(new Book("태백산맥2" , "조정해"));
		library.add(new Book("태백산맥3" , "조정해"));
		library.add(new Book("태백산맥4" , "조정해"));
		library.add(new Book("태백산맥5" , "조정해"));
		
		for (int i = 0 ; i < library.size(); i++) {
			library.get(i).showinfo(); //showinfo 가 출력 메서드
		}
	}

}
