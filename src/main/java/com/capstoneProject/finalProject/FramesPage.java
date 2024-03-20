package com.capstoneProject.finalProject;
import com.capstoneProject.finalProject.BasePage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class FramesPage extends BasePage {
    public FramesPage(WebDriver driver) {
        super(driver);
    }

    public boolean isNestedFramesLinkPresent() {
        return driver.findElement(By.linkText("Nested Frames")).isDisplayed();
    }

    public boolean isIFrameLinkPresent() {
        return driver.findElement(By.linkText("iFrame")).isDisplayed();
    }

    // Add methods to interact with other elements on the Frames Page as needed
}


