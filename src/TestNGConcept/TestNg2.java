package TestNGConcept;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class TestNg2 {

	/*
	@BeforeSuite
	@BeforeClass
	@BeforeMethod
	@BeforeTest
	
	@AfterMethod
	@AfterTest
	@AfterClass
	@AfterSuite
	
	*/
	
	
	/*
	@BeforeMethod
	@Test-1
	@AfterMethod
	
	@BeforeMethod
	@Test-2
	@AfterMethod
	
	
	*/
	
	
	
	// Precondition annotation :- Starting with @Before
	@BeforeSuite  // 1st
	public void setup() {

		System.out.println("BeforeSuite:- set up ");
	}

	@BeforeClass
	public void login() {

		System.out.println("BeforeClass:- login");

	}

	@BeforeMethod
	public void enterURL() {

		System.out.println("BeforeMethod:- enterURL");
	}

	@BeforeTest // 2nd
	public void LaunchBrowser() {

		System.out.println("BeforeTest:- launch crome browser");
	}

	
	@Test(priority =1)
	public void GoogleTitleTest1() {
		
		System.out.println("google title test 1");
	}
	@Test(priority =2)
	public void GoogleTitleTest2() {
		
		System.out.println("google title test 2");
	}
	@Test(priority =3)
	public void GoogleTitleTest3() {
		
		System.out.println("google title test 3");
	}
	
	// PostCondition annotation :- Starting with @After
	
	@AfterMethod
	public void logout() {
		
		System.out.println("AfterMethod:- log out");
	}
	
	@AfterTest
	public void deleteAllCookies() {
		System.out.println("AfterTest:- delete all cookies");
	}
	
	@AfterClass
	public void closeBrowser() {
		System.out.println("AfterClass:- close browser");
	}
	
	@AfterSuite
	public void genereatereports() {
		System.out.println("AfterSuite:- generate test reports");
	}
	
}
