package se.bettercode.seleniumstarter;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.htmlunit.HtmlUnitDriver;

import static org.junit.Assert.assertEquals;

/**
 * Example Selenium test using HtmlUnitDriver
 */
public class MyFirstTest {

  private WebDriver driver;

  @Before
  public void setUp() {
    driver = new HtmlUnitDriver();
  }

  @After
  public void cleanUp() {
    driver.quit();
  }

  @Test
  public void goToWebPage() {
    driver.get("http://the-internet.herokuapp.com");
    assertEquals("The Internet", driver.getTitle());
  }

}
