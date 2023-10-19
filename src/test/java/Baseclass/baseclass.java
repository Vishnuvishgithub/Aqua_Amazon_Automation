package Baseclass;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.BeforeSuite;

public class baseclass {

public String baseurl= "https://www.amazon.in/";

public WebDriver driver;


@BeforeSuite

    public void Url_Open()  {

    driver = new EdgeDriver();
    driver.get(baseurl);
    driver.manage().window().maximize();

}








}
