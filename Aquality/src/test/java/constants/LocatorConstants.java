package constants;

import lombok.experimental.UtilityClass;

@UtilityClass
public class LocatorConstants {
    public final String ID_PATH= "//*[@id='%s']";
    public final String PRECISE_TEXT_XPATH = "//*[text()='%s']";
    public final String PARTICULAR_TEXT_XPATH = "//*[contains(text(),'%s')]";
}
