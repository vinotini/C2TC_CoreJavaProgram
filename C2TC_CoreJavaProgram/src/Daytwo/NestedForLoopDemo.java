package Daytwo;

public class NestedForLoopDemo {

	public static void main(String[] args) {
		int beg=1;
		int end=4;

		for (int i = beg; i <= end; i++) {
			for (int j = 1; j <= 10; j++) {
				System.out.println(i + "*" + j + "= " + i * j);
			}
			System.out.println();

		}

	}

}
