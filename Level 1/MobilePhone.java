public class MobilePhone{
	
	String brand;
	String model;
	double price;
	
	MobilePhone(String brand, String model, double price){
		this.brand = brand;
		this.model = model;
		this.price = price;
	}
	
	void display(){
		System.out.println("Brand: "+brand);
		System.out.println("Model: "+model);
		System.out.println("Price: \n"+price);
	}
	
	public static void main(String[] args){
		MobilePhone ph = new MobilePhone("One Plus", "13R", 43000);
		MobilePhone ph2 = new MobilePhone("Samsung", "S25 Ultra", 100000);
		
		ph.display();
		ph2.display();
	}
}