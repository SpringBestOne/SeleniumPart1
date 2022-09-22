package day01;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class C04_ilkTest {
    public static void main(String[] args) {

        System.setProperty("webdriver.chrome.driver","src/resources/drivers/chromedriver.exe");
        WebDriver driver= new ChromeDriver();

        /*
        Amazon sayfasına gidiniz
        Baslığın Amazon içerdiğini test ediniz
        Url nin amazon içerdiğini test ediniz
        Sayfayi kapatınız

         */

        // Amazon sayfasına gidiniz
        driver.get("https://www.amazon.com");

        // Baslığın Amazon içerdiğini test ediniz
        System.out.println("Actual Title yani driver.getTitle() = " + driver.getTitle());
        String arananKelime="Amazon";
        if(driver.getTitle().contains(arananKelime)){
            System.out.println("driver.getTitle : Passed");
        }else System.out.println("FAİLED");

        //Url nin amazon içerdiğini test ediniz
        String istenenKelime="amazon";
        if(driver.getPageSource().contains(istenenKelime)){
            System.out.println("PageSourse testi PASSED");
        }else System.out.println("PageSourse testi FAİLED");

        //Sayfayi kapatınız
        driver.close();


            //
    }
}
