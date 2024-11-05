package com.epam.tests;

import com.epam.pageObjects.LandingPage;
import com.epam.testcomponents.BaseTest;
import org.testng.annotations.Test;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.InterruptedIOException;
import java.util.Properties;

public class GooglePageTest extends BaseTest
{
    LandingPage landingPage;
    public static Properties properties = null;
    public static String workingDir = null;

    @Test
    public void verifyGoogleHomePage() throws InterruptedIOException
    {
        properties = new Properties();
        landingPage = new LandingPage(driver);

        workingDir = System.getProperty("user.dir");
        System.out.println(workingDir);

        try {
            FileInputStream fileInputStream = new FileInputStream(workingDir + "\\src\\main\\java\\com\\epam\\resources\\GlobalData.properties");
            properties.load(fileInputStream);
        } catch (IOException e) {
            e.printStackTrace();
        }

        landingPage.goTo();
    }
}
