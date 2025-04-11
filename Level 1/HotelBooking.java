public class HotelBooking{
	
	private String guestName;
	private String roomType;
	private int nights;
	
	HotelBooking(){
		guestName = "Kshitij";
		roomType = "1BHK";
		nights = 6;
	}
	
	HotelBooking(String guestName, String roomType, int nights){
		this.guestName = guestName;
		this.roomType = roomType;
		this.nights = nights;
	}
	
	HotelBooking(HotelBooking roombooking){
		this.guestName = roombooking.guestName;
		this.roomType = roombooking.roomType;
		this.nights = roombooking.nights;
	}
	
	public static void main(String[] args){
		HotelBooking p1 = new HotelBooking();
		HotelBooking p2 = new HotelBooking("Manoj", "2BHK", 2);
		HotelBooking p3 = new HotelBooking(p1);
		
		System.out.println(p1.guestName);
		System.out.println(p2.roomType);
		System.out.println(p3.nights);
		
		
	}
}