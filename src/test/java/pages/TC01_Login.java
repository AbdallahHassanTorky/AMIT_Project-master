package pages;


import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class TC01_Login {
    stepDefs.Hooks login = new stepDefs.Hooks();
    public WebDriver driver=login.driver;

    public WebElement email() {
        return login.driver.findElement(By.xpath("//input[@id='user-name']"));
    }

    public WebElement password() {
        return login.driver.findElement(By.xpath("//input[@id='password']"));
    }

    public WebElement loginButton() {
        return login.driver.findElement(By.xpath("//input[@id='login-button']"));
    }

    public WebElement WrongMessage() {
        return login.driver.findElement(By.xpath("//h3[contains(text(),'Epic sadface: Username and password do not match a')]"));
    }

}