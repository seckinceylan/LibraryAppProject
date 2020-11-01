package com.library.Pages;

import com.library.Utils.BrowserUtils;
import com.library.Utils.Driver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.List;

public abstract class BasePage {
    //@FindBy(className = "oro-subtitle")
    //protected WebElement pageSubTitle;


    public BasePage() {
        PageFactory.initElements(Driver.getDriver(), this);
    }




}
