package listners;

import io.qameta.allure.Allure;
import io.qameta.allure.listener.TestLifecycleListener;
import io.qameta.allure.model.Status;
import io.qameta.allure.model.TestResult;

import java.io.ByteArrayInputStream;
import static aquality.selenium.browser.AqualityServices.getBrowser;
public class TestResultListner implements TestLifecycleListener {

    @Override
    public void afterTestUpdate(TestResult result) {
        if(result.getStatus() == Status.FAILED || result.getStatus() == Status.BROKEN) {
            attachScreenshot();
        }
    }

    public void attachScreenshot() {
        byte[] screenshot = getBrowser().getScreenshot();
        if(screenshot!=null) {
            System.out.println("Screenshot attached");
            Allure.addAttachment("Screenshot", new ByteArrayInputStream(screenshot));
        }
    }
}
