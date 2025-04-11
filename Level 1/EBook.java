class Book_3{
	
	public int ISBN;
	protected String title;
	private String author;
	
	Book_3(int ISBN, String title, String author){
		this.ISBN =ISBN;
		this.title = title;
		this.author =author;
	}
	
	public void setAuthor(String author){
		this.author = author;
	}
	
	public String getAuthor(){
		return author;
	}
	
	void display(){
		System.out.println("ISBN: "+ISBN);
		System.out.println("Title: "+title);
		System.out.println("Author: "+author);
	}
	
	public static void main(String[] args){
		Book_3 p1 = new Book_3(1290338120, "Alice's Adventures in Wonderland", "Lewis Carroll");
		p1.display();
		
		EBook b1 = new EBook(1290338189,"Around the World in Eighty Days", "Jules Verne");
		b1.display();
	}
}

public class EBook extends Book_3{
	EBook(int ISBN, String title, String author){
		super(ISBN, title, author);
		setAuthor("Kshitij");
	}
	
	void display(){
		System.out.println("Author: "+getAuthor());
	}
}