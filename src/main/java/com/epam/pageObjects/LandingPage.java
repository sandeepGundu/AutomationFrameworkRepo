package com.epam.pageObjects;

import com.epam.abstractcomponents.AbstractComponent;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

import java.time.Duration;

public class LandingPage extends AbstractComponent
{
    WebDriver driver;

    public LandingPage(WebDriver driver)
    {
        super(driver);
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    public void goTo()
    {
        driver.get("https://google.com");
        driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(20));
    }
}
