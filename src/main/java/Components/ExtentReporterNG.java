package Components;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;


// Raporlama için kullanılan ExtentReport'un ayarlarını içeren sınıftır.
public class ExtentReporterNG {
    public static ExtentReports getReportObject(){
        String path = System.getProperty("user.dir") + "//reports//index.html";
        ExtentSparkReporter reporter = new ExtentSparkReporter(path);
        reporter.config().setReportName("Piton Technology E2E Assessment");
        reporter.config().setDocumentTitle("Test Results");
        ExtentReports extent = new ExtentReports();
        extent.attachReporter(reporter);
        extent.setSystemInfo("Tester","Ali Ozkan");
        extent.createTest(path);
        return extent;
    }
}
