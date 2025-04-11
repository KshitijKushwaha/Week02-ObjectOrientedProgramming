public class Person{

	private int height = 185;
	private int weight = 82;

	Person(){ } 
	
	int getheight(){
		return height;
	}
	
	int getweight(){
		return weight;
	}

	Person(Person Copyperson){
		this.height = Copyperson.height;
		this.weight = Copyperson.weight;
	}

	public static void main(String[] args){
		Person p1 = new Person();
		Person p2 = new Person(p1);
		
		System.out.println(p1.getheight());
		System.out.println(p1.getweight());
		System.out.println(p2.getheight());
		System.out.println(p2.getweight());
		
	}
}