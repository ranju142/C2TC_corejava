
class Employee {
	int id;
	String name;
	float salary;
	Employee() {
		System.out.println("user defined no-argument" + "constructed executed");
	}
	void display() {
		System.out.println(id + " " + name + " " + salary);
	}

}
