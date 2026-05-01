import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class CuraTest {
    @Test
    public void loginTest() {
        // Open Chrome browser 
        WebDriver driver = new ChromeDriver();
        
        // Visit Site
        driver.get("https://katalon-demo-cura.herokuapp.com/");
        
        // Click the Login button on the homepage
        driver.findElement(By.id("btn-make-appointment")).click();
        
        // Insert Credentials
        driver.findElement(By.id("txt-username")).sendKeys("John Doe");
        driver.findElement(By.id("txt-password")).sendKeys("ThisIsNotAPassword");
        
        // Click Login button
        driver.findElement(By.id("btn-login")).click();
        
        // Close the Browser
        driver.quit();
    }
}