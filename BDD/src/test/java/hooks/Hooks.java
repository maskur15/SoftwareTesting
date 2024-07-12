package hooks;

import io.cucumber.java.*;
import utils.SettingsTestData;

import static aquality.selenium.browser.AqualityServices.getBrowser;

public class Hooks {
    @Before
    public void setUp() {
        getBrowser().goTo(SettingsTestData.getEnvData().getHost());
        getBrowser().maximize();
    }

    @After
    public void tearDown() {
        getBrowser().quit();
    }

    @BeforeStep("not @bita")
    public void before(Scenario scenario) {
        scenario.log("Runs before each step in scenarios *not* tagged with @bita");
    }

    @AfterStep("not @bita")
    public void after(Scenario scenario) {
        scenario.log("Runs after each step");
    }
}
