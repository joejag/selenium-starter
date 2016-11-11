package se.bettercode.seleniumstarter;

import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.htmlunit.HtmlUnitDriver;

import static org.junit.Assert.assertEquals;

/**
 * Example Selenium test using HtmlUnitDriver
 */
public class MyFirstTest {

  @Test
  public void goToWebPage() {
    WebDriver driver = new HtmlUnitDriver();
    driver.get("http://the-internet.herokuapp.com");
    assertEquals("The Internet", driver.getTitle());
    driver.quit();
  }

}
