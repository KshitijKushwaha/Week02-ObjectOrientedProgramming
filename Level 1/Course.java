public class Course{

	String courseName;
	int duration;
	int fee;
	static String instituteName = "SRMIST";
	
	Course(String courseName, int duration, int fee){
		this.courseName = courseName;
		this.duration = duration;
		this.fee = fee;
	}
	
	void displayCourseDetails(){
		System.out.println(courseName);
		System.out.println(duration);
		System.out.println(fee);
	}
	
	void updateInstituteName(String newinstituteName){
		instituteName = newinstituteName;
		System.out.print(instituteName);
	}

	public static void main(String[] args){
		Course p1 = new Course("B.Tech", 4, 350000);
		
		p1.displayCourseDetails();
		p1.updateInstituteName("IIT");
	}
}