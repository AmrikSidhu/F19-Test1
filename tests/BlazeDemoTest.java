// Amrik Singh Sidhu , SID: C0742318

import static org.junit.Assert.*;

import java.util.List;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class BlazeDemoTest {
	//Location of chrome_driver file
	final String CHROMEDRIVER_LOCATION = "/Users/zangrazyjatt/Desktop/chromedriver"; 
	
	// BLAZEDEMO.COM
	final String URL_TO_TEST = "http://www.blazedemo.com";
	WebDriver driver;

	@Before
	public void setUp() throws Exception {
	System.setProperty("webdriver.chrome.driver",CHROMEDRIVER_LOCATION);
	driver = new ChromeDriver();
	driver.get(URL_TO_TEST);
	
	
		
	}

	@After
	public void tearDown() throws Exception {
	}

	@Test
	public void departureCityCountTest() {
		// total departure cities  and destination.
		List<WebElement> totalCities = driver.findElements(By.cssSelector("form select"));
		
		//departure cities INDEX
		WebElement  departureCities = totalCities.get(0);
		//list of departure cities
		List<WebElement>  departureList= departureCities.findElements(By.cssSelector("option"));
		System.out.println("Departure cities =" +departureList.size());
		assertEquals(7,departureList.size());		
	}
	
	@Test
	public void virginAmericaflightTest() {
		//button click
		WebElement btnfindFlights = driver.findElement(By.cssSelector(".container .container input"));
		btnfindFlights.click();
		
		//all flights 
		List<WebElement> totalFlights = driver.findElements(By.cssSelector("table tbody tr"));
		System.out.println("all flights =" +totalFlights.size());
		
		//Virgin America Flight #12
		WebElement flight12 = totalFlights.get(3);
		//flight#12 details
		List<WebElement> flightDetails = flight12.findElements(By.cssSelector("td"));
		System.out.println("No. of columns " +flightDetails.size());
		
		System.out.println("Departs =" +flightDetails.get(3).getText());
		//checking, departure time equals to 11:23 AM
		assertEquals("11:23 AM",flightDetails.get(3).getText());
		
		//checking arrival time equals to 1:45 AM
		assertEquals("1:45 PM",flightDetails.get(4).getText());
		System.out.println("Departs = " +flightDetails.get(4).getText());
				
		//checking cost equals to $765.32
		assertEquals("$765.32",flightDetails.get(5).getText());
		System.out.println("Departs = " +flightDetails.get(5).getText());
		
		//click on 'choose this flight' button	
		WebElement selFlightBtn =  flightDetails.get(0);
		selFlightBtn.click();
	}
	

}
