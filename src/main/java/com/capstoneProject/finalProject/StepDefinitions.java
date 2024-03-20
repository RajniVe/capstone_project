package com.capstoneProject.finalProject;
import com.capstoneProject.finalProject.HomePage;
import com.capstoneProject.finalProject.FramesPage;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

public class StepDefinitions {

private WebDriver driver;
private HomePage homePage;
private FramesPage framesPage;

    @Given("User navigates to the website {string}")
    public void userNavigatesToTheWebsite(String url) {
        System.setProperty("webdriver.chrome.driver", "path/to/chromedriver");
        driver = new ChromeDriver();
        homePage = new HomePage(driver);
        homePage.navigateTo("http://the-internet.herokuapp.com/");
    }

    @Then("The title of the page should be {string}")
    public void theTitleOfThePageShouldBe(String expectedTitle) {
        String actualTitle = driver.getTitle();
        Assert.assertEquals(actualTitle, expectedTitle);
    }

    @When("User clicks on the A/B Testing link")
    public void userClicksOnTheABTestingLink() {
         homePage.clickABTestingLink();
 }

    @Then("The text on the page should be {string}")
    public void theTextOnThePageShouldBe(String expectedText) {
        String actualText = driver.findElement(By.tagName("h3")).getText();
        Assert.assertEquals(actualText, expectedText);
    }

    @When("User clicks on the Dropdown link")
    public void userClicksOnTheDropdownLink() {
        homePage.clickDropdownLink();
    }

    @When("User selects Option 1 from the dropdown")
    public void userSelectsOption1FromTheDropdown() {
        driver.findElement(By.id("dropdown")).sendKeys("Option 1");
    }

    @Then("Option 1 should be selected")
    public void option1ShouldBeSelected() {
        String selectedOption = driver.findElement(By.id("dropdown")).getText();
        Assert.assertEquals(selectedOption, "Option 1");
    }

    @When("User clicks on the Frames link")
    public void userClicksOnTheFramesLink() {
       homePage.clickFramesLink();
        framesPage = new FramesPage(driver);
    }

    @Then("Nested Frames link should be presented")
    public void nestedFramesLinkShouldBePresented() {
       Assert.assertTrue(framesPage.isNestedFramesLinkPresent());
       
    }

    @Then("iFrame link should be presented")
    public void iframeLinkShouldBePresented() {
         Assert.assertTrue(framesPage.isIFrameLinkPresent());
    }
}
