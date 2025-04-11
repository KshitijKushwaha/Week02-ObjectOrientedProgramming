public class Book{

	private String title;
	private String author;
	int price;
	
	Book(){
		title = "The God of Small Things";
		author = "Arundhati Roy";
		price = 300;
	}
	
	Book(String title, String author, int price){
		this.title = title;
		this.author = author;
		this.price = price;
	}

	public static void main(String[] args){
		Book b1 = new Book("Pride and Prejudice", "Jane Austen", 550);
		Book b2 = new Book();
		
		System.out.println(b2.title);
		System.out.println(b2.author);
		System.out.println(b2.price);
		
		System.out.println(b1.title);
		System.out.println(b1.author);
		System.out.println(b1.price);
	}
}
