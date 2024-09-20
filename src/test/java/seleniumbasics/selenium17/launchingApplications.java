package seleniumbasics.selenium17;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;
public class launchingApplications {

    @Test
    public void launchinggoogle(){
        //where path is exactly present
        System.out.println(System.getProperty("user.dir"));
        System.setProperty("webdriver.chrome.driver",System.getProperty("user.dir")+"//src//test//resources//driver//chromedriver.exe");

        WebDriver driver=new ChromeDriver();
        driver.get("https://www.google.com");





    }

}