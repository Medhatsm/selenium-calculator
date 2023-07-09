package com.example;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class SeleniumTest {
  private WebDriver driver;

  @BeforeMethod
  public void setUp() {
    System.setProperty("webdriver.chrome.driver", "/usr/bin/chromedriver");
       // Set the path to the ChromeDriver executable 
     ChromeOptions chromeOptions = new ChromeOptions();
    // Initialize ChromeDriver
    
    chromeOptions.addArguments("--headless");
    chromeOptions.addArguments("--no-sandbox");
    driver = new ChromeDriver(chromeOptions); 
  }

  @Test
  public void api0() {
    driver.get("http://localhost:9080/api/sum/geometric?first=1&ratio=0.5&count=5");
    System.out.println("Page Title: " + driver.getTitle());

  }

  @Test
  public void api1() {

    driver.get("http://localhost:9080/api/evaluate/3*7");
    System.out.println("Page Title: " + driver.getTitle());
  }
  @Test
  public void api2() {
    driver.get("http://localhost:9080/api/evaluate/(3*7+4)*0.2");
System.out.println("Page Title: " + driver.getTitle());
  }

  @Test
  public void api3() {
     driver.get("http://localhost:9080/api/evaluate/3*cos(2*3.141592653589793238) ");
    System.out.println("Page Title: " + driver.getTitle());
  }

  @Test
  public void helloWorldTest() {
     driver.get("http://localhost:9080/api/evaluate/unknowFunction(2)");
    System.out.println("Page Title: " + driver.getTitle());
  }

  @AfterMethod
  public void tearDown() {
    // Quit the browser
    if (driver != null) {
      driver.quit();
  }
  }
}