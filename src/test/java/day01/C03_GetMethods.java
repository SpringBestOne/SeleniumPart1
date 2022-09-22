package day01;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class C03_GetMethods {
     /*
        Yeni bir package olusturalim : day01
        Yeni bir class olusturalim : C03_GetMethods
        Amazon sayfasina gidelim. https://www.amazon.com/
        Sayfa basligini(title) yazdirin
        Sayfa basliginin “Amazon” icerdigini test edin
        Sayfa adresini(url) yazdirin
        Sayfa url’inin “amazon” icerdigini test edin.
        Sayfa handle degerini yazdirin
        Sayfa HTML kodlarinda “Gateway” kelimesi gectigini test edin
        Sayfayi kapatin.
         */

    public static void main(String[] args) {

        System.setProperty("webdriver.chrome.driver", "src/resources/drivers/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();

        //Amazon sayfasina gidelim. https://www.amazon.com/
        driver.get("http:amazon.com");

        //Sayfa basligini(title) yazdirin
        System.out.println("Sayfa Basligi = " + driver.getTitle());

        //Sayfa basliginin “Amazon” icerdigini test edin
        String arananKelime = "Amazon";
        if (driver.getTitle().contains(arananKelime)) {
            System.out.println("Title Testi PASSED");
        } else System.out.println("Title Testi FAİLED");

        //Sayfa adresini(url) yazdirin
        System.out.println("Sayfa url = " + driver.getCurrentUrl());

        //Sayfa url’inin “amazon” icerdigini test edin.
        String istenenKelime = "amazon";
        if (driver.getCurrentUrl().contains(istenenKelime)) {
            System.out.println("Url Testi PASSED");
        } else System.out.println("Url Testi FAILED");

        //Sayfa handle degerini yazdirin
        System.out.println("driver.getWindowHandle() = " + driver.getWindowHandle());

        //Sayfa HTML kodlarinda “Gateway” kelimesi gectigini test edin
        String icerenKelime = "Gateway";
        if (driver.getWindowHandle().contains(icerenKelime)) {
            System.out.println("HTML Testi PASSED");
        } else System.out.println("HTML Testi FAILED");

        // Sayfayi kapatin.
        driver.close();


    }
}