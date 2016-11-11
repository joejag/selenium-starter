package se.bettercode.seleniumstarter;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.htmlunit.HtmlUnitDriver;

import java.util.List;

import static org.junit.Assert.assertEquals;

/**
 * Example test where we use @BeforeClass to setup driver and get a web page so that each test method can assert
 * a single thing.
 */
public class MySecondTest {


  private static WebDriver driver;

  @BeforeClass
  public static void setUp() {
    driver = new HtmlUnitDriver();
    driver.get("http://the-internet.herokuapp.com");
  }

  @AfterClass
  public static void cleanUp() {
    driver.quit();
  }

  @Test
  public void title() {
    assertEquals("The Internet", driver.getTitle());
  }


  @Test
  public void listItemCount() {
    final List<WebElement> elements = driver.findElements(By.xpath("//*[@id=\"content\"]/ul/li"));
    assertEquals(40, elements.size());
  }

}
