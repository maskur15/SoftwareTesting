package pages.heroku;

import aquality.selenium.elements.interfaces.ILink;
import aquality.selenium.forms.Form;
import constants.LocatorConstants;
import constants.MainPageNavigation;
import org.openqa.selenium.By;

public class MainPage extends Form {
    private static final String PAGE_NAME = "Welcome to the-internet";

    public MainPage() {
        super(By.xpath(String.format(LocatorConstants.PRECISE_TEXT_XPATH, PAGE_NAME)), "Main Page");
    }

    private ILink getNavigationLink(MainPageNavigation navigation) {
        return getElementFactory().getLink(By.xpath(String.format(LocatorConstants.PRECISE_TEXT_XPATH, navigation.getLabel())), navigation.getLabel());
    }

    public void clickNavigationLink(MainPageNavigation navigation) {
        getNavigationLink(navigation).click();
    }
}
