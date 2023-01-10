package oop.protectedmod.satupackage;

public class Student {
	private int graduationYear = 2018;

	public static void main(String[] args) {
		Person myObj = new Person();
		System.out.println("Name: " + myObj.fname + " " + myObj.lname);
		System.out.println("Email: " + myObj.email);
		System.out.println("Age: " + myObj.age);
	}
}