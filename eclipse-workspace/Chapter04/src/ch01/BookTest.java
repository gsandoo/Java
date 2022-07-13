package ch01;

class Book{
	
	private String title;
	private String author;
	
	public Book(String title, String author) {
		this.title = title;
		this.author = author;
	}

	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return title + "," + author;
	}
	
	
}
public class BookTest {

	public static void main(String[] args) {
		
		Book book = new Book("돈키호테", "널만");
		System.out.println(book);
		
	}

}
