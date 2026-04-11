package testscripts;

public class BrowserCommands extends BaseClass {
	
	public void browserCommandsMethods()
	{
		//String s = driver.getTitle(); //need to get the title of the page
		//System.out.println(s);
		
	//	String url = driver.getCurrentUrl();
		//System.out.println(url);
		
		String pagesource = driver.getPageSource(); //it gives the corresponding HTML code
		System.out.println(pagesource);
	}

	public static void main(String[] args)
	{
	
	BrowserCommands object = new BrowserCommands();
	object.browserInitialisation(); //initialisation needs to be given first
	object.browserCommandsMethods();
	object.browserQuitClose();
		
	}

}
