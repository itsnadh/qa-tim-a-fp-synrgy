package page;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class HomePage {
    WebDriver driver;

    //List test -> checkout pakai filter dan search
    //define variables
    By searchBar = By.xpath("//*[@id=\"search\"]/div/input");
    By searchBtn = By.xpath("//*[@id=\"search\"]/div/button");

    public HomePage(WebDriver driver){
        this.driver = driver;
    }

//    public void clickHome(){}
}
