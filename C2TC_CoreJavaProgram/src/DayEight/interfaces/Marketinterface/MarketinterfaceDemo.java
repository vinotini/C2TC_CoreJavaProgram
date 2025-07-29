package DayEight.interfaces.Marketinterface;

public class MarketinterfaceDemo {

	public static void main(String[] args) {
		Student s=new Student(101,"Maha",16000,"Java");
		if (s instanceof Registrable )
			System.out.println("Student is registered ");
		else
			System.out.println("Student is not registered ");
			

	}

}