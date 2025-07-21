package Daytwo;

public class ForEachLoopDemo {

	public static void main(String[] args) {
		//for integer array
        int a[]= {10,20,30,40,50};	

		for(int i:a)
		{
		System.out.println(i);	
		}
		//for char array
		char ch[]= {'j','a','v','a'};
		for(char c:ch)
		{
			System.out.print(c);		
		}
		System.out.println(" ");
		//for String array
		String s1[]= {"Java","programming","learning"};

		for(String s:s1)
		{
			System.out.print(s+" ");		
		}

}

}