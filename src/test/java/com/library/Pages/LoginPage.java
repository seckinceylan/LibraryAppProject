package com.library.Pages;

import com.library.Utils.ConfigurationReader;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class LoginPage extends BasePage {

    @FindBy(id= "inputEmail")
    private WebElement username;

    @FindBy(id = "inputPassword")
    private WebElement password;

    @FindBy(xpath = "//div[@class ='alert alert-danger']")
    private WebElement warningMessage;

    public void login(String usernameValue, String passwordValue) {
        username.sendKeys(usernameValue);
        password.sendKeys(passwordValue, Keys.ENTER);
    }

        public void login(String role) {
        String usernameValue = "";
        String passwordValue = "";
        if (role.equalsIgnoreCase("librarian")) {
            usernameValue = ConfigurationReader.getProperty("librarian.username");
            passwordValue = ConfigurationReader.getProperty("librarian.password");
        } else if (role.equalsIgnoreCase("student59")) {
            usernameValue = ConfigurationReader.getProperty("student59.username");
            passwordValue = ConfigurationReader.getProperty("student59.password");
        } else {
            usernameValue = ConfigurationReader.getProperty("student60.username");
            passwordValue = ConfigurationReader.getProperty("student60.password");
        }
        username.sendKeys(usernameValue);
        password.sendKeys(passwordValue, Keys.ENTER);
    }

    public String getWarningMessageText() {
        try {
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        return warningMessage.getText();
    }
}
