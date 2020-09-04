// filename: tests/BaseTest.java
package tests;

import org.junit.Rule;
import org.junit.rules.ExternalResource;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class BaseTest {

    protected WebDriver driver;

    @Rule
    public ExternalResource resource = new ExternalResource() {

        @Override
        protected void before() throws Throwable {
            System.setProperty("webdriver.chrome.driver", "/Users/lindsaywalker/Documents/chromedriver");
            ChromeOptions browserOptions = new ChromeOptions();
            driver = new ChromeDriver();
        }

        @Override
        protected void after() {
            driver.quit();
        }

    };
}