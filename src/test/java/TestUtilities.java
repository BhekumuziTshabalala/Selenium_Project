import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import java.io.*;
import java.time.Duration;
import java.util.Properties;

public class TestUtilities {
    public static WebDriver driver;
    public static Duration waitTime;
    public static String applicationURL;
    public void configureEnvironment(){

    }

    public boolean readConfigurations(){
        try {
            BufferedReader bufferedReader = new BufferedReader(new FileReader("configurations.properties"));
            setConfigurations(bufferedReader);
        }catch (IOException exception){
            System.out.println("Error occurred :" + exception.getMessage());
            setDefault();
            return false;
        }
        return true;

    }

    public void setConfigurations(BufferedReader configurations){


    }

    public void setDefault(){

    }

    public static void setDriver(String browser) {
        switch (browser){
            case "edge":
                driver = new EdgeDriver();
            default :
                driver = new ChromeDriver();
        }
    }
}
