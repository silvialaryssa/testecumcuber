package pages;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import util.TestRule;

public class CommonPage {

    //private static final Duration Duration = Duration.of(30);
    
	protected WebDriver driver = TestRule.getDriver();

    public CommonPage(){}

    //actions example
    protected void moveToElement(WebElement element){
        Actions action = new Actions(driver);
        action.moveToElement(element).build().perform();
    }

    //explicit wait example
    protected void waitVisibilityOf(WebElement element){
       // WebDriverWait wait = new WebDriverWait(driver, 30);
    	Duration duration1 = Duration.ofSeconds(30);
    	WebDriverWait wait = new WebDriverWait(driver, duration1);
        
        wait.until(ExpectedConditions.visibilityOf(element));
    }


}
