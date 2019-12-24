package by.bsu.page;

import by.bsu.model.Vaucher;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.concurrent.TimeUnit;

public class RentPage extends AbstractPage{
    private static final Logger LOGGER = LogManager.getRootLogger();
    private final String RENTPAGE_URL = "https://www.autoeurope.ru/my-booking/";
    private WebDriverWait wait ;

    public RentPage(WebDriver driver) {
        super(driver);
        PageFactory.initElements(this.driver, this);
        wait = new WebDriverWait(driver, WAIT_TIMEOUT_SECONDS);
    }


    @Override
    public by.bsu.page.RentPage openPage() {
        driver.navigate().to(RENTPAGE_URL);
        LOGGER.info("Rent page opened");
        return this;
    }

    @FindBy(xpath = "//*[@id=\"frmVoucherLookup\"]/div[1]/input")
    private WebElement name;

    @FindBy(xpath = "//*[@id=\"frmVoucherLookup\"]/div[2]/input")
    private WebElement surname;

    @FindBy(xpath = "//*[@id=\"vouchnum-lookup\"]")
    private WebElement vaucherNumber;

    @FindBy(xpath = "//*[@id=\"submitBtn\"]")
    private WebElement viewButton;


    public by.bsu.page.RentPage fillFromParams(Vaucher params) {
        LOGGER.info("Filled vauchers");
        return this;
    }

    public by.bsu.page.RentPage inputVaucherNamber(String pickUpVauchernumber) {
        vaucherNumber.click();
        vaucherNumber.clear();
        vaucherNumber.sendKeys(pickUpVauchernumber);
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        LOGGER.info("Filled 'input vaucher number' field with " + pickUpVauchernumber);
        return this;
    }
    public by.bsu.page.RentPage inputSurname(String pickUpSurname) {
        surname.click();
        surname.clear();
        surname.sendKeys(pickUpSurname);
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        LOGGER.info("Filled 'input surname' field with " + pickUpSurname);
        return this;
    }

    public by.bsu.page.RentPage inputName(String pickUpName) {
        name.click();
        name.clear();
        name.sendKeys(pickUpName);
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        LOGGER.info("Filled 'input vaucher number' field with " + pickUpName);
        return this;
    }

    public void search() {
        viewButton.click();
        LOGGER.info("Searching...");
    }

}
