import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;



public class appium {

@Test()
        public void app() throws InterruptedException {
   // public static void main(String arg[]){

        System.setProperty("webdriver.chrome.driver","C:\\Users\\lenovo\\Downloads\\chromedriver.exe");
       WebDriver driver = new ChromeDriver();
    //WebDriverWait wait;
   // wait = new WebDriverWait(driver, 5);
       driver.get("https://eiappdev.azurewebsites.net/#/login");
       driver.findElement(By.xpath("/html/body/app-login/div/div/div[3]/div[1]/form-text/div/div/input")).sendKeys("sateesh.h@ecoinsight.com");
       driver.findElement(By.xpath("/html/body/app-login/div/div/div[3]/div[2]/form-text/div/div/input")).sendKeys("admin123");
       driver.findElement(By.xpath("//*[@id='ei-login']")).click();
       //New feature execution
   Thread.sleep(2000);
   driver.findElement(By.xpath("//*[@id=\"bs-example-navbar-collapse-1\"]/ul/li[1]/a")).click();
    Thread.sleep(2000);
   driver.findElement(By.xpath("/html/body/ei-dialog/section/div/newfeatures/section/div[2]/button")).click();
    Thread.sleep(2000);
    driver.findElement(By.xpath("//*[@id=\"bs-example-navbar-collapse-1\"]/ul/li[1]/a")).click();
    Thread.sleep(2000);
    driver.findElement(By.xpath("/html/body/ei-dialog/section/div/newfeatures/section/a")).click();
    Thread.sleep(2000);
   driver.findElement(By.xpath("/html/body/startlayout/div/div/home/div/div/div[2]/div[3]")).click();

   // driver.findElement(By.cssSelector("body > startlayout > div > div > home > div > div > div.hlayout > div:nth-child(3)")).click();



       //driver.findElement(By.xpath("/html/body/startlayout/div/div/home/div/div/div[2]/div[5]/img.img-avatar"));
      // wait.until(ExpectedConditions.visibilityOf(text));
      // text.click();

    }
}



