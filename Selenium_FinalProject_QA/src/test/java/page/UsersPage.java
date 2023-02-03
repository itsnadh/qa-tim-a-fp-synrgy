package page;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class UsersPage {
    WebDriver driver;

    By usersMenu = By.xpath("//*[@id=\"basic-navbar-nav\"]/div/a[2]");
    By addUserBtn = By.xpath("//*[@id=\"root\"]/div[1]/a");
    By detailUserBtn = By.xpath("//*[@id=\"root\"]/div[1]/table/tbody/tr[1]/td[6]/div/a");
    By changeUserBtn = By.xpath("//*[@id=\"root\"]/div[1]/table/tbody/tr[1]/td[6]/div/button[1]");
    By deleteUserBtn = By.xpath("//*[@id=\"root\"]/div[1]/table/tbody/tr[1]/td[6]/div/button[2]");

    public UsersPage(WebDriver driver){
        this.driver = driver;
    }

    public void showUserList(){
        driver.findElement(usersMenu).click();
    }

    public void addUser(){
        driver.findElement(addUserBtn);
    }

    public void detailUser(){
        driver.findElement(detailUserBtn).click();
    }

    public void changeUser(){
        driver.findElement(changeUserBtn).click();
    }

    public void deleteUser(){
        driver.findElement(deleteUserBtn).click();
    }
}
