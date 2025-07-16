package retry;

import org.testng.IRetryAnalyzer;
import org.testng.ITestResult;

public class RetryAnalyzer implements IRetryAnalyzer {

	private int initialRetryCount = 0; //when testcase got failed,need to retry testcase, initial count will be zero 
	private static final int maxRetryCount = 3;

	@Override
	public boolean retry(ITestResult result) {
		
		if(initialRetryCount<maxRetryCount) {
			
			initialRetryCount++;
			return true;
		}

		return false;
	}

}