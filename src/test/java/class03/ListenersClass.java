package class03;

import org.testng.ITestListener;
import org.testng.ITestResult;

public class ListenersClass implements ITestListener {

    @Override
    public void onTestFailure(ITestResult result) {
        System.out.println("The test case has failed is " + result.getName());
    }
    @Override
    public void onTestSuccess(ITestResult result) {
        System.out.println("The test case has passed is " + result.getName());
    }


}

