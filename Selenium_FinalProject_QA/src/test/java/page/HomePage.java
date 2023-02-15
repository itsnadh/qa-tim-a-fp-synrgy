package page;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class HomePage {
    WebDriver driver;

    // List test -> checkout pakai filter dan search
    // define variables
    By searchBar = By.xpath("//*[@id=\"search\"]/div/input");
    By searchBtn = By.xpath("//*[@id=\"search\"]/div/button");
    By kost1 = By.xpath(
            "//div[@class = \"card-title h5\" and text()=\"Kost Permata Medang Tipe A Gading Serpong Tangerang 7507UWHA\"]");

    By kostA = By.xpath("//div[@class=\"g-4 row\"]/div[@class=\"col-lg-4 col-12\"][1]");

    public HomePage(WebDriver driver) {
        this.driver = driver;
    }

    public void clickKost1() throws InterruptedException {
        Boolean enable = driver.findElement(kostA).isEnabled();
        System.out.println("Kost card is " + enable);

        WebElement myelement = driver.findElement(kostA);
        JavascriptExecutor jse2 = (JavascriptExecutor) driver;
        jse2.executeScript("arguments[0].scrollIntoView(true);", myelement);
        System.out.println("web scrolled");

        Thread.sleep(3000);
        driver.findElement(kostA).click();
        System.out.println("Kost card clicked");
        // driver.findElement(kost1).click();
    }
}
