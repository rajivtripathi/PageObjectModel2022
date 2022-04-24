package roughWork2;

import org.testng.annotations.Test;

public class client extends Maruti {


	@Test
	public void client() {
		
		System.out.println("----"+value);
		System.out.println("===="+name);
		Maruti maruti = new Maruti();
		maruti.name=name;
		maruti.value=value;
		System.out.println(" client sum "+maruti.SumMaruti());
		
	}

}
