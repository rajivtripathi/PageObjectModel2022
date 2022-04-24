package roughWork1;

import org.testng.annotations.BeforeMethod;

public class Car {
	
	public int value;
	public String name ;
	
	@BeforeMethod
	public void setUp() {
		
		System.out.println(" before method is called ");
		value=10;
		name="car";
	}

}
