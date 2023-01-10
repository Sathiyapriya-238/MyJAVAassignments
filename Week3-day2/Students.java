package org.system;

public class Students {
	
	public void getStudentInfo(int studentId) {
		System.out.println("Student Id is: "+studentId);
	}
	public void getStudentInfo(int studentId,String name) {
		System.out.println("Student Id is: "+studentId+" Name: "+name);
	}
	public void getStudentInfo(String eMail,long phoneNumber) {
		System.out.println("Email: "+eMail+" PhoneNumber: "+phoneNumber);
	}

	public static void main(String[] args) {
		Students obj= new Students();
		obj.getStudentInfo(152);
		obj.getStudentInfo(153, "Sathiyapriya");
		obj.getStudentInfo("abc@gmail.com", 9876543210l);
	}

}

	
