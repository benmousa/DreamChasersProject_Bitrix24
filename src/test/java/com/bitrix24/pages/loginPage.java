package com.bitrix24.pages;

import com.bitrix24.utilities.ConfigurationReader;
import com.bitrix24.utilities.Driver;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class loginPage {

    protected static WebDriverWait wait = new WebDriverWait(Driver.getDriver(), 10);

    public loginPage() {
        //we put this line to be able to use @FindBy, @FindBys.. annotations
        PageFactory.initElements(Driver.getDriver(), this);
    }

    @FindBy(xpath = "//input[@type='text']")
    public WebElement userNameElement;

    @FindBy(xpath = "//input[@type='password']")
    public WebElement passWordElement;

    @FindBy(xpath = "//input[@type='submit']")
    public WebElement loginButton;

    /*
     * Method to login, version #1
     * Login as a specific user
     *
     * @param userName
     * @param passWord

    public static void login(String userName, String passWord) {
        Driver.getDriver().get(ConfigurationReader.getProperty("qa_env"));
        wait.until(ExpectedConditions.visibilityOf(userNameElement)).sendKeys(userName);
        wait.until(ExpectedConditions.visibilityOf(passWordElement)).sendKeys(passWord, Keys.ENTER);

    }


     * Method to login, version #2
     * Login as a default user
     * Credentials will be retrieved from configuration.properties file

    public static void login() {
        Driver.getDriver().get(ConfigurationReader.getProperty("qa_envWebSite"));
        String userName = ConfigurationReader.getProperty("helpDeskUsername7");
        String passWord = ConfigurationReader.getProperty("passWord");
        wait.until(ExpectedConditions.visibilityOf(userNameElement)).sendKeys(userName);
        wait.until(ExpectedConditions.visibilityOf(passWordElement)).sendKeys(passWord, Keys.ENTER);
    }

     */

}
