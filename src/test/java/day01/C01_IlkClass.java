package day01;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class C01_IlkClass {
    public static void main(String[] args) {
        /*
        En temel haliyle bir otomasyon yapmak için, classımızza otomasyon için gerekli olan webdriver in yerini göstermemiz gerekir.
        Bunun için Java kütüphanesinden, Sysytem.setProperty() methodu kullanırız.
        Vre methodun içine ilk olarak diriver i yazarız. İkinci olarak fiziki yolunu kopyalarız.
         */

        System.setProperty("webdriver.chrome.driver","src/resources/drivers/chromedriver.exe");
        WebDriver driver =new ChromeDriver();
        driver.get("https://www.amazon.com");

        System.out.println("Actual Title yani driver.getTitle() = " + driver.getTitle());//Gidilen sitenin başlığını yazdırır
        System.out.println("Actual Url yani driver.getCurrentUrl() = " + driver.getCurrentUrl()); // Gidilen sitenin Url sini getirir

        System.out.println(driver.getPageSource()); //Sayfadaki kaynak kodlarını verir

    }
}
