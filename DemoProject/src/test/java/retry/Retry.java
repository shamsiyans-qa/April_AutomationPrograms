package retry;

import org.testng.IRetryAnalyzer;
import org.testng.ITestResult;

public class Retry implements IRetryAnalyzer {
	int counter = 0; //variable
	int retryLimit = 2; //for failed test case, how many time we need to retry 
	
	public boolean retry(ITestResult result)
	{
		if(counter<retryLimit) //(0<2) (1<2)
		{
			counter++;   //re execute
			return true;
		}
		return false;   //re execution: stop 
	}

}
