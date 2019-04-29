package pages;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class common {

    WebDriver driver;

    public common(WebDriver driver){
        this.driver = driver;
    }

    public void openPage(String url){
        driver.get(url);
        driver.manage().window().maximize();
    }

    public static void waitToAndClick(WebDriver driver, By elemento){

        WebDriverWait wait = new WebDriverWait(driver, 30);
        wait.until(ExpectedConditions.visibilityOfElementLocated(elemento));
        driver.findElement(elemento).click();
    }

    public static String waitToAndGetText(WebDriver driver, By elemento){

        WebDriverWait wait = new WebDriverWait(driver, 30);
        wait.until(ExpectedConditions.visibilityOfElementLocated(elemento));
        driver.findElement(elemento).getText();
        return null;
    }

    public void closePage() {
        driver.close();
    }


}
