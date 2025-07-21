package Daytwo;

public class NestedIfElseDemo {

	public static void main(String[] args) {
		int k=10, l=20, m=50;
		System.out.println("The largest number is");
		if (k > l) {
			if (k > m)
				System.out.println(k);
			else
				System.out.println(m);
		} else {
			if (m > l)
				System.out.println(m);
			else
				System.out.println(l);
		}

	}

}