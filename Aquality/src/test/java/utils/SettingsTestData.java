package utils;

import aquality.selenium.browser.AqualityServices;
import aquality.selenium.core.utilities.ISettingsFile;
import aquality.selenium.core.utilities.JsonSettingsFile;
import com.google.gson.Gson;
import models.*;
import lombok.experimental.UtilityClass;

import java.io.FileNotFoundException;
import java.io.FileReader;

@UtilityClass
public class SettingsTestData {
    private static final String RESOURCES_PATH = "src/test/resources/";
    private static final String TEST_DATA_PATH = RESOURCES_PATH + "testdata/";
    private static final String ENVIRONMENT_PATH = RESOURCES_PATH + "environment/";
    private static final String USER_FILE_PATH = TEST_DATA_PATH + "userData.json";
    private static final String DATA_TABLE_FILE_PATH = TEST_DATA_PATH + "dataTableData.json";
    private static final String FILE_DATA_PATH = TEST_DATA_PATH + "fileData.json";
    private static final ISettingsFile ENVIRONMENT_CONFIG = new JsonSettingsFile("env.json");
    private static final Gson GSON = new Gson();

    public String getResourcesPath() {
        return  RESOURCES_PATH;
    }

    public String getTestDataPath() {
        return TEST_DATA_PATH;
    }

    public TestData getTestData() {
        return deserializeJson(TEST_DATA_PATH+"searchData.json", TestData.class);
    }

    public static EnvData getEnvData() {
        String envConfigPath = String.format("%s%s.json", ENVIRONMENT_PATH, getCurrentEnvironment());
        return deserializeJson(envConfigPath, EnvData.class);
    }

    public static UserData getUserData() {
        return deserializeJson(USER_FILE_PATH, UserData.class);
    }

    public static DataTableData getDataTableData() {
        return deserializeJson(DATA_TABLE_FILE_PATH, DataTableData.class);
    }

    public static FileData getFileData() {
        return deserializeJson(FILE_DATA_PATH, FileData.class);
    }

    private static String getCurrentEnvironment() {
        return ENVIRONMENT_CONFIG.getValue("/env").toString();
    }

    private static <T> T deserializeJson(String filePath, Class<T> tClass) {
        try {
            return GSON.fromJson(new FileReader(filePath), tClass);
        } catch (FileNotFoundException e) {
            AqualityServices.getLogger().error(String.format("Settings file %s not found or incorrect. Error msg: %s", filePath, e));
            throw new RuntimeException(e);
        }
    }
}
