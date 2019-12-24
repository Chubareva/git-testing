package by.bsu.Test;

import by.bsu.page.RentPage;
import by.bsu.service.CarCreator;
import by.bsu.util.StringUtil;
import by.bsu.model.User;
import by.bsu.page.MainPage;
import by.bsu.model.Vaucher;
import by.bsu.service.UserCreator;
import by.bsu.service.VaucherCreator;
import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.reporters.jq.Main;

import static by.bsu.service.VaucherCreator.TESTDATA_VAUCHER_VAUCHERNUMBER;
import static by.bsu.util.StringUtil.ERROR_MESSAGE;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.equalTo;
import static org.hamcrest.Matchers.is;
public class MainPageTest extends CommonConditions{
//    @Test
//    public void oneCanLogin()
//    {
//        User testUser = UserCreator.withCredentialsFromProperty();
//        String loggedInUserEmail = new MainPage(driver)
//                .openPage()
//                .login(testUser)
//                .getLoggedInUserName();
//        assertThat(loggedInUserEmail, is(""));
//    }
//
//    @Test
//    public void searchRentingFromVaucher()
//    {
//        Vaucher testVaucher= VaucherCreator.withCredentialsFromProperty();
//        String vaucherinfo = new MainPage(driver)
//                .openPage()
//                .getLoggedInUserName();
//        assertThat(vaucherinfo, is(""));
//    }
//    @Test
//    public void searchCityWithoutCondtition()
//    {
//        String errorMessage = new MainPage(driver)
//                .openPage()
//                .search()
//                .getErrorMessage();
//        assertThat(errorMessage, is(equalTo(ERROR_MESSAGE)));
//    }
//
//    @Test
//    public void searchVaucherNumber()
//    {
//        String vauchers = new RentPage(driver)
//                .openPage()
//                .search()
//                .getLoggedInVaucherNumber();
//        assertThat(vauchers, is(equalTo(TESTDATA_VAUCHER_VAUCHERNUMBER)));
//    }
//    @Test
//    public void searchCarsForPastDate() {
//        MainPage page = new MainPage(driver);
//        page.openPage().fillFromParams(CarCreator.withPastPickUpDate).search();
//        Assert.assertTrue(page.checkTimeErrorMessage(ERROR_MESSAGE));
//    }


}
