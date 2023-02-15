package page;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import groovy.time.Duration;

import org.openqa.selenium.Keys;

public class PengajuanSewaPage {
    WebDriver driver;

    public PengajuanSewaPage(WebDriver driver) {
        this.driver = driver;
    }

    By ajukanText = By.xpath("//h2[text() = \"Pengajuan Sewa Kos\"]");
    By ajukanSewaBtn = By.xpath("//button[@type = \"submit\" and text() = \"Ajukan Sewa Kos Sekarang\"]");

    public void onPengajuanSewaPage() {
        driver.findElement(ajukanText).isDisplayed();
    }

    public void clickAjukanSewa() {
        driver.findElement(ajukanSewaBtn).click();
    }

    public void clickOk() {
        // WebDriverWait wait = new WebDriverWait(driver, 3000);
        // wait.until(ExpectedConditions.alertIsPresent());
        Alert alert = driver.switchTo().alert();
        alert.accept();
    }
}
