package com.weborders.pages;

import com.weborders.utilities.Driver;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.WebDriverWait;


/**
 * It meant to be extended
 */
public abstract class AbstractBasePage {
   protected WebDriver driver = Driver.getDriver();
   protected WebDriverWait wait = new WebDriverWait(driver,10);


    public AbstractBasePage(){
        PageFactory.initElements(Driver.getDriver(),this);
    }
}
