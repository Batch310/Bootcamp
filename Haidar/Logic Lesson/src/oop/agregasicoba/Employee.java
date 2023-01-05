package oop.agregasicoba;

public class Employee {
	int id;
	String name;
	Address address;

	public Employee(int id, String name, Address address) {
		this.id = id;
		this.name = name;
		this.address = address;
	}

	void employeeInfo() {
		System.out.println(id + " " + name);
		System.out.println(address.city + " " + address.state + " " + address.country);
	}

	public static void main(String[] args) {
		Address address1 = new Address("gzb", "UP", "india");
		Address address2 = new Address("gno", "UP", "india");

		Employee e = new Employee(111, "varun", address1);
		Employee e2 = new Employee(112, "arun", address2);

		e.employeeInfo();
		System.out.println();
		e2.employeeInfo();

	}
}
//Source: https://www.javatpoint.com/aggregation-in-java