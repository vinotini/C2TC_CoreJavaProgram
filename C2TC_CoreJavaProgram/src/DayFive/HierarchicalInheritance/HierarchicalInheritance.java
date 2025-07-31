package DayFive.HierarchicalInheritance;

public class HierarchicalInheritance {
	
	public static void main(String[] args) {
		
		Person p1 = new Person();
		System.out.println("----------------- Person Details ---------------------");
		System.out.println(p1);

		//Person p;
		Person p = new Person("Vimala", "Puducherry");
		if (p instanceof Person)
			System.out.println("Person Details "+p);
		
		p = new Employee("Manohar", "chennai", 102, 90000, "Sales");
		if (p instanceof Employee)
		System.out.println("Employee Details "+p);
		

		p = new Student("Giri", "Pune", "FE", 88);
		if (p instanceof Student)
			System.out.println("Student Details "+p);

	}
}