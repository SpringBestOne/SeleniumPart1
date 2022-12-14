package day03;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class Xpath {
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver","src/resources/drivers/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

        //https://the-internet.herokuapp.com/add_remove_elements/ adresine gidin
        driver.get("https://the-internet.herokuapp.com/add_remove_elements/");

        // 2- Add Element butonuna basin
        Thread.sleep(3000);
       driver.findElement(By.xpath("//*[@onclick='addElement()']")).click();
       // driver.findElement(By.xpath("//*[tex()='Add Element']")).click();

        // Delete butonu’nun gorunur oldugunu test edin
        WebElement deleteButton=driver.findElement(By.xpath("//*[@class='added-manually']"));
        if(deleteButton.isDisplayed()){
            System.out.println("TEST PASSED");
        }else System.out.println("TEST FAİLED");
        // Delete tusuna basin
        deleteButton.click();
        // “Add/Remove Elements” yazisinin gorunur oldugunu test edin
        WebElement addRemoveElement = driver.findElement(By.xpath("//h3"));
        if(addRemoveElement.isDisplayed()){
            System.out.println("TEST PASSED");
        }else System.out.println("TEST FAILED");
       // Sayfayi kapatın
        driver.close();

    }
}