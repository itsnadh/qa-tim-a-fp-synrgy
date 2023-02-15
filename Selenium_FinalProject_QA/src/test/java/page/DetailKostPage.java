package page;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class DetailKostPage {

    WebDriver driver;

    public DetailKostPage(WebDriver driver) {
        this.driver = driver;
    }

    By kalender = By.xpath("//div[@class=\"row\"]/div[@class=\"col-lg-6\"]/div/input");
    By durasi = By.xpath("//div[@class=\"row\"]/div[@class=\"col-lg-6\"]/select");
    By monthly = By.xpath("//div[@class=\"row\"]/div[@class=\"col-lg-6\"]/select/option[@value = \"MONTHLY\"]");

    By pilihTipeBtn = By.xpath("//div[@class=\"card-body\"]/button[@type=\"button\" and text() = \"Pilih Tipe Kos\"]");

    public void setTanggal() {
        driver.findElement(kalender).sendKeys("12122023");
    }

    public void setMonthly() {
        driver.findElement(durasi).click();
        driver.findElement(monthly).click();
    }

    public void clickPilihTipeKost() {
        driver.findElement(pilihTipeBtn).click();
    }

}
