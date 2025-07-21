package Daytwo;

public class DecisionMakingWithOperator {

	public static void main(String[] args) {
		int x = 80, y = 70;
		int a = 1;
		int b = 10;

		if (x >= y) {
			System.out.println("true");
		} else {
			System.out.println("false");
		}

		if (!(a < b) || (a == b)) {
			System.out.println("Condition is true,well done");
		} else

		{
			System.out.println("Condition is false,sorry");
		}

	}

}