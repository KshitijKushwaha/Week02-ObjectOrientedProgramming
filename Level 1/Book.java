public class Book{
	
	private String title;
	private String author;
	double price;
	
	void display(){
		System.out.println(title);
		System.out.println(author);
		System.out.println(price);
	}
	
	public static void main(String[] args){
		Book b = new Book();
		
		b.title = "Rich Dad Poor Dad";
		b.author = "Robert Kiyosaki";
		b.price = 250.0;
		
		b.display();
	}
}