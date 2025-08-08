package base;

import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;

import io.restassured.RestAssured;
import reports.ExtentManager;
import utils.ConfigReader;

public class BaseTest {
	
	public static ExtentReports extent;
    public static ExtentTest test;

    @BeforeSuite
    public void setup() {
        RestAssured.baseURI = ConfigReader.getProperty("baseURI");
        extent = ExtentManager.getInstance();
    }

    @AfterSuite
    public void tearDown() {
        extent.flush();
    }
}
