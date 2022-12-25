package TestComponents;


import Components.ExtentReporterNG;
import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import org.openqa.selenium.WebDriver;
import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

import java.io.IOException;

public class Listeners extends BaseTest implements ITestListener {
    ExtentTest test;
    ExtentReports extent = ExtentReporterNG.getReportObject();
    ThreadLocal<ExtentTest> extentTest = new ThreadLocal<ExtentTest>();

    @Override
    public void onTestStart(ITestResult result) {
        test = extent.createTest(result.getMethod().getMethodName());
        extentTest.set(test);
        Log.info(result.getMethod().getMethodName() + " Started");
        Log.info(result.getMethod().getDescription());

    }

    @Override
    public void onTestSuccess(ITestResult result) {
        extentTest.get().log(Status.PASS, "TEST PASSED");
        Log.info(result.getMethod().getMethodName() + " Passed");
        Log.info("-----------------------");
    }

    @Override
    public void onTestFailure(ITestResult result) {
        Log.info("Failed because of : " + result.getThrowable());
        Log.info("-----------------------");
        extentTest.get().fail(result.getThrowable());
        try {
            driver = (WebDriver) result.getTestClass().getRealClass().getField("driver").get(result.getInstance());
        } catch (IllegalAccessException e) {
            throw new RuntimeException(e);
        } catch (NoSuchFieldException e) {
            throw new RuntimeException(e);
        }
        String filePath = null;
        try {
            filePath = getScreenshot(result.getMethod().getMethodName(), driver);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        try {
            extentTest.get().addScreenCaptureFromPath(filePath, result.getMethod().getMethodName());
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    @Override
    public void onTestSkipped(ITestResult result) {
        Log.info("Skipped because of : " + result.getThrowable());
    }

    @Override
    public void onStart(ITestContext context) {
        Log.info("======== Start : " + context.getName() + " ========");
    }

    @Override
    public void onFinish(ITestContext context) {
        extent.flush();
        Log.info("======== Finish : " + context.getName() + " ========");


    }
}
