package by.bsu.page;
import by.bsu.model.Car;
import by.bsu.model.User;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.Optional;
import java.util.concurrent.TimeUnit;


public class MainPage extends AbstractPage {
    private static final Logger LOGGER = LogManager.getRootLogger();
    private final String MAINPAGE_URL = "https://www.autoeurope.ru/index.cfm";
    private WebDriverWait wait;

    public MainPage(WebDriver driver) {
        super(driver);
        PageFactory.initElements(this.driver, this);
        wait = new WebDriverWait(driver, WAIT_TIMEOUT_SECONDS);
    }

    public MainPage openPage() {
        driver.get(MAINPAGE_URL);
        LOGGER.info("Home page opened");
        return this;
    }

    @FindBy(xpath = "//*[@id=\"ui-id-99\"]")
    private WebElement carFromInput;

    @FindBy(xpath = "//*[@id=\"ui-id-102\"]")
    private WebElement cityFromInput;

    @FindBy(xpath = "//*[@id=\"pickup-date\"]")
    private WebElement placeFromInput;

    @FindBy(xpath = "//*[@id=\"ae-search\"]/div[3]/div[1]/div/button")
    private WebElement takeDateInput;

    @FindBy(xpath = "//*[@id=\"ae-search\"]/div[3]/div[2]")
    private WebElement takeTimeInput;

    @FindBy(className = "//*[@id=\"ae-search\"]/div[3]/div[3]/div")
    private WebElement deliveryDateInput;
    @FindBy(className = "//*[@id=\"ae-error\"]/div[2]/div[3]/div")
    private WebElement errorMessage;

    @FindBy(className = "//*[@id=\"ae-search\"]/div[3]/div[4]/div")
    private WebElement deliveryTimeInput;

    @FindBy(id = "//*[@id=\"ae-search\"]/div[3]/div[5]/label")
    private WebElement driverAge;

    @FindBy(id = "//*[@id=\"ae-search\"]/div[3]/div[6]/button")
    private WebElement searchButton;

    @FindBy(className = "//*[@id=\"secnav__country\"]/div")
    private WebElement countryButton;

    @FindBy(className = "//*[@id=\"nav\"]")
    private WebElement ResorvationButton;

    @FindBy(className = "//*[@id=\"primnav--acct\"]/li[2]")
    private WebElement AccountButton;

    @FindBy(id = "email_field")
    private WebElement inputEmail;

    @FindBy(id = "password")
    private WebElement inputPassword;

    @FindBy(xpath = "//input[@value='Sign in']")
    private WebElement buttonSubmit;

    @FindBy(xpath = "//*[@id=\"account_login_form\"]/div[3]")
    private WebElement email;
    @FindBy(xpath = "//*[@id=\"account_login_form\"]/div[4]")
    private WebElement password;
    @FindBy(xpath = "//*[@id=\"account_login_button\"]")
    private WebElement buttonUserSubmit;
    @FindBy(xpath = "//*[@id=\"secnav__country\"]")
    private WebElement languageButton;
    @FindBy(xpath = " //*[@id=\"sitepicker\"]/div[3]/div[3]/dl[2]/dd/dl/a[1]")
    private WebElement chinaButton;
    @FindBy(xpath = " //*[@id=\"secnav__country\"]/div/li/span")
    private WebElement lang;


    public void search() {
        searchButton.click();
        LOGGER.info("Searching...");
    }

    public String getErrorMessage(){
        return errorMessage.getText();
    }

    public MainPage fillFromParams(Car params) {
        LOGGER.info("Filled cars");
        return this;
    }


    public MainPage inputCarFrom(String pickUpCarFrom) {
        carFromInput.click();
        carFromInput.clear();
        carFromInput.sendKeys(pickUpCarFrom);
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        LOGGER.info("Filled 'input car from the country' field with " + pickUpCarFrom);
        return this;
    }
    public MainPage inputCityFrom(String pickUpCityFrom) {
        cityFromInput.click();
        cityFromInput.clear();
        cityFromInput.sendKeys(pickUpCityFrom);
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        LOGGER.info("Filled 'input car from the city' field with " + pickUpCityFrom);
        return this;
    }


    public MainPage inputPlaceFrom(String pickUpPlaceFrom) {
        placeFromInput.click();
        placeFromInput.clear();
        placeFromInput.sendKeys(pickUpPlaceFrom);
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        LOGGER.info("Filled 'input car from the place' field with " + pickUpPlaceFrom);
        return this;
    }

    public MainPage inputTakeTime(String returnTakeTime) {
        takeTimeInput.click();
        takeTimeInput.clear();
        takeTimeInput.sendKeys(returnTakeTime);
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        LOGGER.info("Filled 'return take time' field with " + returnTakeTime);
        return this;
    }
    public MainPage inputTakeDate(String returnTakeDate) {
        takeDateInput.click();
        takeDateInput.clear();
        takeDateInput.sendKeys(returnTakeDate);
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        LOGGER.info("Filled 'return take data' field with " + returnTakeDate);
        return this;
    }


    public MainPage inputDelivaryTime(String returnDelivaryTime) {
        deliveryTimeInput.click();
        deliveryTimeInput.clear();
        deliveryTimeInput.sendKeys(returnDelivaryTime);
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        LOGGER.info("Filled 'return delivery time' field with " + returnDelivaryTime);
        return this;
    }
    public MainPage inputDelivaryDate(String returnDelivaryDate) {
        deliveryDateInput.click();
        deliveryDateInput.clear();
        deliveryDateInput.sendKeys(returnDelivaryDate);
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        LOGGER.info("Filled 'return delivary date' field with " + returnDelivaryDate);
        return this;
    }


    public RentPage openLoginPage() {
        LOGGER.info("Rent page opening...");
        countryButton.click();
        return new RentPage(driver);
    }
    public String  getErrorLogin() {
        WebElement login = email.findElement(By.xpath(".."));
        return  login.findElement(By.cssSelector("small")).getText();
    }
    public  String getErrorPassword() {
        WebElement passwordInput = password.findElement(By.xpath(".."));
        return   passwordInput.findElement(By.cssSelector("small")).getText();
    }

    public MainPage login(User user) {
        return this;
    }

    public String getLoggedInUserName(){
        return "";

    }

    public MainPage changeLanguage(){
        languageButton.click();
        chinaButton.click();
        return this;
    }

    public String getUrl(){
        return driver.getCurrentUrl();
    }

    public String getLang(){
        return lang.getText();
    }
}
