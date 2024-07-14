package listners;
import io.qameta.allure.Allure;
import io.qameta.allure.listener.TestLifecycleListener;
import io.qameta.allure.model.Status;
import io.qameta.allure.model.TestResult;
import org.testng.ITestListener;
import org.testng.ITestResult;
import tests.BaseTest;

import java.io.ByteArrayInputStream;
import java.util.logging.Logger;

import static aquality.selenium.browser.AqualityServices.getBrowser;

public class ListenFirst extends BaseTest implements TestLifecycleListener, ITestListener {

    private static final Logger logger = Logger.getLogger(ListenFirst.class.getName());

    @Override
    public void afterTestUpdate(TestResult result) {
        if (result.getStatus() == Status.FAILED || result.getStatus() == Status.BROKEN) {
            logger.info("Test failed or broken, attaching screenshot.");
            attachScreenshot();
        }
    }

    @Override
    public void onTestFailure(ITestResult result) {
        logger.info("Test failed, attaching screenshot.");
        attachScreenshot();
    }

    @Override
    public void onTestSkipped(ITestResult result) {
        logger.info("Test skipped, attaching screenshot.");
        attachScreenshot();
    }

    @Override
    public void onTestFailedButWithinSuccessPercentage(ITestResult result) {
        logger.info("Test failed but within success percentage, attaching screenshot.");
        attachScreenshot();
    }

    public void attachScreenshot() {
        try {
            byte[] screenshot = getBrowser().getScreenshot();
            if (screenshot != null) {
                logger.info("Screenshot captured, attaching to Allure report.");
                Allure.addAttachment("Screenshot", new ByteArrayInputStream(screenshot));
            } else {
                logger.warning("Screenshot is null, not attaching.");
            }
        } catch (Exception e) {
            logger.severe("Failed to capture and attach screenshot: " + e.getMessage());
        }
    }
}
