package day01;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class C02_DriverMethodlari {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver","src/resources/drivers/chromedriver.exe");

        WebDriver driver=new ChromeDriver();
        driver.manage().window().maximize();
        //Amazon sayfasına giziniz
        driver.get("https://amazon.com");
        // kaynak kodların içinde "Gateway" kelimesinin olduğunu test edin

        // driver.getPageSource();  Sayfanın kaynak kodlarını verir

        String istenenKelime="Gateway";
        if(driver.getPageSource().contains(istenenKelime)){
            System.out.println("PageSourse testi PASSED");
        }else System.out.println("PageSourse testi FAİLED");

        driver.close(); // sayfayi kapatır
        //driver.quit():  //Birden fazla sayfa varsa hepsini kapatır
    }
}

