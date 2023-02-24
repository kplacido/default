package Core;

import org.junit.After;
import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.remote.DesiredCapabilities;

import java.util.concurrent.TimeUnit;

public class Testes {


    String navegador = "chrome";
    public WebDriver iniciar () {
        WebDriver driver = null;

        if(navegador.equals("ie")){
            System.setProperty("webdriver.ie.driver", "C:\\Users\\cleyt\\OneDrive\\Documentos\\default\\webProj-main\\drivers\\IEDriverServer.exe");





                DesiredCapabilities dc = DesiredCapabilities.internetExplorer();
                dc.setJavascriptEnabled(true);
                dc.setCapability(InternetExplorerDriver.INTRODUCE_FLAKINESS_BY_IGNORING_SECURITY_DOMAINS, true);
                //dc.setCapability(InternetExplorerDriver.IE_ENSURE_CLEAN_SESSION, true);
                dc.setCapability(InternetExplorerDriver.ENABLE_ELEMENT_CACHE_CLEANUP, true);
                dc.setCapability(InternetExplorerDriver.NATIVE_EVENTS, false);




            driver = new InternetExplorerDriver(dc);

        }else if(navegador.equals("chrome")) {
            System.setProperty("webdriver.chrome.driver", "C:\\Users\\cleyt\\OneDrive\\Documentos\\default\\webProj-main\\drivers\\chromedriver.exe");
            driver = new ChromeDriver();
        }

        driver.get("https://www.google.com.br");
        return driver;

    }



    @Test
    public void novoTeste() throws InterruptedException {

        By window = By.xpath("//div[@class='modal-content']");


        WebDriver driver = iniciar();


        Thread.sleep(10000);

        driver.quit();








    }
}
