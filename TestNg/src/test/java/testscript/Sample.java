package testscript;

import org.testng.annotations.Test;

public class Sample extends BaseClass{
	
	@Test(priority=1)
	public void show()
	{
		
		System.out.println("Hello; this is my 1st TestNG Project");
		
	}

	@Test(priority=2)
	public void display()
	{
		System.out.println("Hai All");
	}
}
