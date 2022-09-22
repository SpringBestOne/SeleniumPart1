package day03;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chromium.ChromiumDriver;

import java.time.Duration;

public class Xpath_Odev {
    public static void main(String[] args) throws InterruptedException {

        System.setProperty("webdriver.chrome.driver","src/resources/drivers/chromedriver.exe");
        WebDriver driver=new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
;
        // https://the-internet.herokuapp.com/add_remove_elements/ adresine gidin
        driver.get("https://the-internet.herokuapp.com/add_remove_elements/");

        //  2- Add Element butonuna basin

        //  3-Delete butonu’nun gorunur oldugunu test edin
        //4-Delete tusuna basin
        //“Add/Remove Elements” yazisinin gorunur oldugunu test edin






        //2- Add Element butonuna basin
        WebElement tikla = driver.findElement(By.xpath("//*[text() ='Add Element']"));
        tikla.click();

        //3-Delete butonu’nun gorunur oldugunu test edin
        WebElement deleteButton = driver.findElement(By.xpath("//*[text() ='Delete']"));

        //1.YOL
        /*String deleteButtonvarmi=deleteButton.getText();
        String deleteistenen = "Delete";

        if (deleteButtonvarmi.equals(deleteistenen)) {
            System.out.println("Delete testi PASSED");
        }else System.out.println("Delete testi FAILED");*/
        //2.YOL
        if (deleteButton.isDisplayed()) {
            System.out.println("Delete testi PASSED");
        } else System.out.println("Delete testi FAILED");

        Thread.sleep(3000);

        // 4-Delete tusuna basin
        deleteButton.click();

        Thread.sleep(3000);

    }

}