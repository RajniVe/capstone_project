package com.capstoneProject.finalProject;

import com.capstoneProject.finalProject.BasePage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class HomePage extends BasePage {
    public HomePage(WebDriver driver) {
        super(driver);
    }

    public void navigateTo(String url) {
        driver.get(url);
    }

    public String getPageTitle() {
        return driver.getTitle();
    }

    public void clickABTestingLink() {
        driver.findElement(By.linkText("A/B Testing")).click();
    }

    public void clickDropdownLink() {
        driver.findElement(By.linkText("Dropdown")).click();
    }

    public void clickFramesLink() {
        driver.findElement(By.linkText("Frames")).click();
    }
}

