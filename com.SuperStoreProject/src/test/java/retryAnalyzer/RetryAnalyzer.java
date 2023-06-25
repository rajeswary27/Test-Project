package retryAnalyzer;

import org.testng.IRetryAnalyzer;
import org.testng.ITestResult;

public class RetryAnalyzer implements IRetryAnalyzer {
	
	private int retryCount = 0;
	private static final int maximumRetryCount = 5;

	public boolean retry(ITestResult result) {
		if(retryCount < maximumRetryCount) {
			retryCount++;
			return true;
		}
		return false;
	}
	
	

}
