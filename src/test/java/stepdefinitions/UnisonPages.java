package stepdefinitions;

import cucumber.api.PendingException;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import utility.Hook;

public class UnisonPages {

    private WebDriver driver;
    private WebDriverWait wait;

    public UnisonPages() {
        this.driver = Hook.getDriver();
    }

    @Given("^I open a browser$")
    public void ci_open_a_browser() throws Throwable {
        System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir") + "//drivers//chromedriver.exe");
        driver = new ChromeDriver();
        driver.manage().window().maximize();
    }

    @When("^I navigate to google page$")
    public void i_navigate_to_google_page() throws Throwable {
        System.out.println("=====setting url in browser====");
        driver.get("https://mammoth-fe-qa.o-dev.unison.com/");
    }

    @Then("^I validate the search text field$")
    public void i_validate_the_search_text_field() throws Throwable {
        Assert.assertTrue(driver.findElement(By.name("q")).isDisplayed());
    }

    @Then("^I validate the Gmail Link$")
    public void i_validate_the_Gmail_Link() throws Throwable {
        Assert.assertTrue(driver.findElement(By.linkText("Gmail")).isDisplayed());
    }

    @Then("^I validate the Image Link$")
    public void i_validate_the_Image_Link() throws Throwable {
        Assert.assertTrue(driver.findElement(By.linkText("Image")).isDisplayed());
    }

    @When("^I enter \"([^\"]*)\" in search keyword$")
    public void i_enter_in_search_keyword(String searchText) throws Throwable {
        driver.findElement(By.name("q")).clear();
        driver.findElement(By.name("q")).sendKeys(searchText);
        Thread.sleep(5000);
    }

    @Then("^I validate searched text$")
    public void i_validate_searched_text() throws Throwable {
        Thread.sleep(5000);
    }

    @When("^I enter \"([^\"]*)\" in text field$")
    public void i_enter_in_text_field(String searchText) throws Throwable {
        driver.findElement(By.name("q")).clear();
        driver.findElement(By.name("q")).sendKeys(searchText);
    }

    @When("^click on search button$")
    public void click_on_search_button() throws Throwable {
        Thread.sleep(2000);
        driver.findElement(By.xpath("//div[@class='FPdoLc VlcLAe']//input[@name='btnK']")).click();
    }

    @Then("^Selenium webdriver search results page should display$")
    public void selenium_webdriver_search_results_page_should_display() throws Throwable {
//		Assert.assertTrue(("selenium webdriver - Google Search").contentEquals(driver.getTitle()));
    }


//    @And("^close the browser$")
//    public void closeTheBrowser() {
////			Hook.getDriver().quit();
//        driver.close();
//    }
//
//    @When("^I navigate to gmail page$")
//    public void i_navigate_to_gmail_page() throws Throwable {
//        driver.get("http://www.gmail.com");
//        System.out.println("Navigated to gmail login page successfully");
//    }
//
//    @When("^I enter emailid & password in text field$")
//    public void i_enter_emailid_password_in_text_field() throws Throwable {
//        Map<String, String> loginCredentials = new HashMap<String, String>();
//        loginCredentials = Readwritefiles.readwritefiles();
////        JSONPObject json = new JSONPObject();
//        //.readTextFile(Utils.getResourceFile("user_data.json")))
////        C:\Narayana\SDT\May20\OnlineRetail\src\test\java\testdata.json
////        JSONPObject json = new JSONPObject().getValue()
////        throw new PendingException();
//        System.out.println("values read from JSON" + loginCredentials);
//        System.out.println("values read using index from JSON for mail id is" + loginCredentials.get("password"));
//        System.out.println("values read using value from JSON for mail id is" + loginCredentials.get("email"));
//        driver.findElement(By.xpath("//input[@type='email']")).sendKeys("narayana");
//        driver.findElement(By.xpath("//span[contains(text(),'Next')]")).click();
//        driver.findElement(By.xpath("//input[@type='password']")).click();
//        driver.findElement(By.xpath("//span[@class='xjKiLb']")).click();
//        Thread.sleep(5000);
//        driver.findElement(By.xpath("//input[@type='password']")).sendKeys("test");
////		driver.findElement(By.xpath("/span[contains(text(),'Next']")).click();
////		driver.findElement(By.xpath("/input[@type='email']")).sendKeys(loginCredentials.get("password"));
////		driver.findElement(By.xpath("/span[contains(text(),'Next']")).click();
//        System.out.println("entered values successfully in email and password");
//    }

    @When("^click on sign in button$")
    public void click_on_sign_in_button() throws Throwable {
        // Write code here that turns the phrase above into concrete actions
        System.out.println("Navigated to gmail login page successfully");
    }

//    @Then("^it should land on home page of gmail$")
//    public void it_should_land_on_home_page_of_gmail() throws Throwable {
//        // Write code here that turns the phrase above into concrete actions
//        System.out.println("Navigated to gmail login page successfully");
//    }

//    @And("^close the browserscenario with different controls$")
//    public void closeTheBrowserscenarioWithDifferentControls() {
//        driver.quit();
//    }

//    @When("^I navigate to amazon page$")
//    public void iNavigateToAmazonPage() {
//        driver.get("http://www.amazon.com");
//    }

//    @And("^get all links in homepage$")
//    public void getAllLinksInHomepage() {
//        List<WebElement> links = driver.findElements(By.xpath("//div[@id='nav-xshop']/a"));
//        ArrayList<String> brandlinks = new ArrayList<String>();
//        for (int i = 0; i < links.size(); i++) {
////			System.out.println("link name "+links.get(i).getAttribute("text"));
//            brandlinks.add(i, links.get(i).getAttribute("text"));
//        }
//        System.out.println("links are " + brandlinks);
//    }

//    @When("^I navigate to guru(\\d+) page$")
//    public void iNavigateToGuruPage(int arg0) {
//        WebDriver driver = new ChromeDriver();
//        //Creating the JavascriptExecutor interface object by Type casting
//        JavascriptExecutor js = (JavascriptExecutor) driver;
//        //Launching the Site.
//        driver.get("http://demo.guru99.com/V4/");
//        WebElement button = driver.findElement(By.name("btnLogin"));
//        //Maximize window
//        driver.manage().window().maximize();
//        //Set the Script Timeout to 20 seconds
//        driver.manage().timeouts().setScriptTimeout(20, TimeUnit.SECONDS);
//        //Declare and set the start time
//        long start_time = System.currentTimeMillis();
//        //Call executeAsyncScript() method to wait for 5 seconds
//        js.executeAsyncScript("window.setTimeout(arguments[arguments.length - 1], 5000);");
//        //Get the difference (currentTime - startTime)  of times.
//        System.out.println("Passed time: " + (System.currentTimeMillis() - start_time));
////			driver.findElement(By.name("uid")).sendKeys("mngr34926");
////			driver.findElement(By.name("password")).sendKeys("amUpenu");
//        js.executeScript("window.scrollBy(0,600)");
//    }

//    @Then("^verify the script$")
//    public void verifyTheScript() {
//        driver.quit();
//        System.out.println("verified the java script");
//    }

//    @When("^I navigate to guru(\\d+) ajax page$")
//    public void iNavigateToGuruAjaxPage(int arg0) {
//        driver.manage().window().maximize();
//        driver.navigate().to("http://demo.guru99.com/test/ajax.html");
//        By container = By.cssSelector(".container");
//        wait = new WebDriverWait(driver, 5);
//        wait.until(ExpectedConditions.presenceOfElementLocated(container));
//        //Get the text before performing an ajax call
//        WebElement noTextElement = driver.findElement(By.className("radiobutton"));
//        String textBefore = noTextElement.getText().trim();
//        //Click on the radio button
//        driver.findElement(By.id("yes")).click();
//        //Click on Check Button
//        driver.findElement(By.id("buttoncheck")).click();
//        /*Get the text after ajax call*/
//        WebElement TextElement = driver.findElement(By.className("radiobutton"));
//        wait.until(ExpectedConditions.visibilityOf(TextElement));
//        String textAfter = TextElement.getText().trim();
//        System.out.println("textAfter value is" + textAfter);
//        /*Verify both texts before ajax call and after ajax call text.*/
//        Assert.assertNotEquals(textBefore, textAfter);
//        System.out.println("Ajax Call Performed");
//        String expectedText = "Radio button is checked and it's value is Yes";
//        /*Verify expected text with text updated after ajax call*/
//        Assert.assertEquals(textAfter, expectedText);
//        driver.close();
//    }
//
//    @Then("^verify the script    When I navigate to guru(\\d+) page$")
//    public void verifyTheScriptWhenINavigateToGuruPage(int arg0) {
//        driver.get("http://www.unison.com");
//    }

    @When("^I visit unison website$")
    public void iVisitUnisonWebsite() {
        driver.get("https://mammoth-fe-qa.o-dev.unison.com/");
    }
//
//    @And("^get all links in unison homepage$")
//    public void getAllLinksInUnisonHomepage() {
//        List<WebElement> unisonlinks = driver.findElements(By.xpath("//div[contains(@class,\"navigation-desktop__main-link-container\")]"));
//        ArrayList<String> navlinks = new ArrayList<String>();
//        for (int i = 0; i < unisonlinks.size(); i++) {
//            System.out.println(unisonlinks.get(i).getText());
//            navlinks.add(i, unisonlinks.get(i).getText());
//        }
//        System.out.println("Unison links " + navlinks);
//    }

//    @And("^click on about us link$")
//    public void clickOnRandomLink() throws InterruptedException {
//        driver.findElement(By.linkText("About us")).click();
//        System.out.println("clicked on About Us link");
//        Thread.sleep(2000);
//    }
//
//    @Then("^should reach correponding page$")
//    public void shouldReachCorrepondingPage() {
//        Assert.assertTrue(driver.getTitle().contains("About Unison"));
//        System.out.println("Displayed About us page successfully");
//        driver.close();
//        driver.quit();
//    }

    @And("^click on \"([^\"]*)\" on unison home page$")
    public void clickOnOnUnisonHomePage(String link) throws Throwable {
        // Write code here that turns the phrase above into concrete actions
        System.out.println("link name is " + link);
        driver.findElement(By.linkText(link)).click();
        System.out.println("Clicked on the" + (link) + "successfully");
        throw new PendingException();
    }
//
//    @And("^get width of unison logo$")
//    public void getWidthOfUnisonLogo() {
//        String expectedfontsize = "15px";
//        String actualfontsize = driver.findElement(By.xpath("//img[@alt='Unison Logo']")).getCssValue("font-size");
//        Assert.assertEquals(actualfontsize, expectedfontsize);
//        System.out.println("passed");
//    }

    @And("^I click on Payoff debt$")
    public void iClickOnPayoffDebt() {
        Actions action = new Actions(driver);
        WebElement homeowner = driver.findElement(By.id("submenu-trigger-1"));
        action.moveToElement(homeowner).perform();
        WebElement payoffdebt = driver.findElement(By.xpath("//span[contains(text(),'Pay off debt')]"));
        payoffdebt.click();
    }

    @And("^start the application with unison$")
    public void startTheApplicationWithUnison() throws Exception {
        Thread.sleep(2000);
        driver.findElement(By.xpath("//a[contains(text(),'Get Started')]")).click();
    }

    @And("^select retire option$")
    public void selectRetireOption() throws InterruptedException{
        Thread.sleep(10000);
        driver.findElement(By.id("retire")).click();
    }

    @And("^select valid address and prequalify the propery$")
    public void selectValidAddressAndPrequalifyThePropery() throws InterruptedException{
        Thread.sleep(10000);
        driver.findElement(By.id("addressInput")).sendKeys("39655 Trinity Way, Fremont CA");
//        Actions drpdwn = new Actions(driver);
        driver.findElement(By.xpath("//mat-option[contains(@id,'mat-option')]")).click();
//        WebElement addressselection= driver.findElement(By.xpath("//mat-option[contains(@id,'mat-option')]//div"));
//        driver. findElement(By.xpath("//span[@class='mat-option-text']")).click();
//        Actions selectobject = drpdwn.moveToElement(driver.findElement(By.linkText(" 39655 Trinity Way, Fremont CA"))).click();
//        selectobject.perform();
        Thread.sleep(2000);
        driver.findElement(By.id("button_prequal--check-property")).click();
    }

    @And("^submit the form$")
    public void submitTheForm() throws InterruptedException{
        Thread.sleep(10000);
        driver.findElement(By.id("firstname")).sendKeys("test");
        driver.findElement(By.xpath("//input[@id='lastname']")).sendKeys("testb");
        driver.findElement(By.xpath("//input[@id='phone']")).sendKeys("1231231234");
        driver.findElement(By.xpath("//div[@class='mat-select-value']")).sendKeys("Phone");
        driver.findElement(By.xpath("//input[@id='email']")).sendKeys("test@test.com");
        driver.findElement(By.xpath("//button[@id='button__prequal--continue']")).click();
        driver.findElement(By.xpath("//button[@id='credit-excellent']")).click();
        driver.findElement(By.xpath("//button[@id='button__prequal--terms-agree']")).click();
    }

    @Then("^should see the form successfully$")
    public void shouldSeeTheFormSuccessfully() {
        driver.findElement(By.xpath("//h3[contains(text(),'Thank you for your submission!')]")).isDisplayed();
    }
}
