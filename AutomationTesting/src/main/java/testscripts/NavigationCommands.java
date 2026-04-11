package testscripts;

public class NavigationCommands extends BaseClass {
	//for refreshing the page
	
	public void navigations()
	{
		driver.navigate().to("https://www.amazon.in/");
		driver.navigate().back();
		driver.navigate().forward();
		driver.navigate().refresh();
		
		
		
	}
	
	
	

	public static void main(String[] args) {
		
		NavigationCommands object = new NavigationCommands();
		object.browserInitialisation();

		object.navigations();
		//object.browserQuitClose();
	
	}

}
