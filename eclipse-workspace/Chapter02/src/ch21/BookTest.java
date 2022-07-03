package ch21;

public class BookTest {
	public static void main(String[] args) {
		
		Book[] library  = new Book[5]; 
		// null null null null null
		
		Book[]copyLibrary = new Book[5];
		// 카피할 객체 생성 (얕은 복사)
		
		
		library[0] = new Book("코알라0" , "김창식");
		library[1] = new Book("코알라1" , "김창식");
		library[2] = new Book("코알라2" , "김창식");
		library[3] = new Book("코알라3" , "김창식");
		library[4] = new Book("코알라4" , "김창식");
				
		
		//얕은복사
		//System.arraycopy(library, 0, copyLibrary, 0, 5);
		
		
		
		//
		copyLibrary[0] = new Book();
		copyLibrary[1] = new Book();
		copyLibrary[2] = new Book();
		copyLibrary[3] = new Book();
		copyLibrary[4] = new Book();
		
		for(int i = 0; i < library.length ; i++) {
			copyLibrary[i].setName(library[i].getName());
			copyLibrary[i].setAuthor(library[i].getAuthor());
		}
		
//		System.out.println(" = = library = = ");
//		for(Book book : library) {
//			System.out.println(book);
//			book.showinfo();
//		}
//			System.out.println(" = = library = = ");
//			for(Book book : library) {
//				System.out.println(book);
//				book.showinfo();	
//			}	
		library[0].setAuthor("윤서");
		library[0].setName("나목");
		
		System.out.println(" = = library = = ");
		for(Book book : library) {
			System.out.println(book);
			book.showinfo();
		}
			System.out.println(" = = copy library = = ");
			for(Book book : copyLibrary) {
				System.out.println(book);
				book.showinfo();	
			}	
		
	}
}
