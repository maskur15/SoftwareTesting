package utils;

import lombok.experimental.UtilityClass;
import org.awaitility.Awaitility;
import org.openqa.selenium.TimeoutException;

import java.io.File;

@UtilityClass
public class FileUtils {

    public boolean isFileExist(File file) {
        try{
            Awaitility.await().until(file::exists);
        }
        catch (TimeoutException e) {
            return false;
        }
        //deleteFile(file);
        return true;
    }

    public void deleteFile(File file) {
        if(file.exists()) {
            file.delete();
        }
    }
}
