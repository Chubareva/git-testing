package by.bsu.page;

import by.bsu.model.Vaucher;
import org.openqa.selenium.WebDriver;
import by.bsu.page.MainPage;

public abstract class AbstractPage
{
    protected WebDriver driver;

    protected abstract MainPage openPage();
    protected final int WAIT_TIMEOUT_SECONDS = 10;

    protected AbstractPage(WebDriver driver)
    {
        this.driver = driver;
    }


}
