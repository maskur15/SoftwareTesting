package pages.heroku;

import aquality.selenium.browser.AqualityServices;
import aquality.selenium.elements.ElementType;
import aquality.selenium.elements.interfaces.ILabel;
import aquality.selenium.forms.Form;
import constants.LocatorConstants;
import org.openqa.selenium.By;

import java.util.ArrayList;
import java.util.List;

public class DataTablesPage extends Form {
    private static final String NAME = "Data Tables";
    private final By DUE_COLUMN_LOCATOR = By.xpath("//*[@id='table1']//td[4]");

    public DataTablesPage() {
        super(By.xpath(String.format(LocatorConstants.PRECISE_TEXT_XPATH, NAME)), NAME);
    }

    public List<String> retrieveDueList() {
        List<String> dueList = new ArrayList<>();
        for (ILabel label : getFirstDueLabelList()) {
            dueList.add(label.getText());
        }
        return dueList;
    }

    private List<ILabel> getFirstDueLabelList() {
        return AqualityServices.getElementFactory().findElements(DUE_COLUMN_LOCATOR, "due", ElementType.LABEL);
    }
}
