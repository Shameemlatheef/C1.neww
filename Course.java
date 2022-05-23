package com.eva;

public class Course {
 int courseid;
 String courseName ;
 int courseFee;
 void Coursedetails()  {
		System.out.println(courseid);
		System.out.println(courseFee);
		System.out.println(courseName);
		
	}
 static  void authenticate(String u,String p) {
	 if(u=="admin"&& p=="1234") {
		System.out.println(u+" "+p);
		
	 }
	 else {
		 System.out.println("Invalid username and password");
	 }
	 
 }
 public static void main(String[] args) {
	Course h=new Course();
	h.courseid=234;
	h.courseName="masai";
	h.courseFee=123;
	h.Coursedetails();
	authenticate("admin","1234");
	authenticate("shameem","3456");
			
	
}

} 
