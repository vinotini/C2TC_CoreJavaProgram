package DayEight.interfaces.extendinginterfaces;

public class ExtendingInterfaceDemo implements Childinterface {
	
	
	
	public void print() { 
		System.out.println("print method");
	}

	
	public void show() {
		System.out.println("show Method");
	}
	
	public static void main(String[] args) {
        ExtendingInterfaceDemo obj = new ExtendingInterfaceDemo();
        obj.print();  
        obj.show();   
    }
	
}