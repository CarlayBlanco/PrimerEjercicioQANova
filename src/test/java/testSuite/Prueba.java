package testSuite;

import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import testClass.BusquedaAnimalesGoogle;
import testClass.Logeo;

public class Prueba {

    ChromeDriver webDriver;
    String url = "http://www.qanovagroup.com/piloto"; //"https://google.cl";

    @BeforeTest
    public void setUp(){
        System.setProperty("webdriver.chrome.driver", "driverNavegador/chromedriver.exe");
        webDriver = new ChromeDriver();
        webDriver.get(url);
    }

    @AfterTest
    public void closeDriver(){
        //webDriver.close();
    }

    @Test
    public void buscarPerroEnGoogle(){
        BusquedaAnimalesGoogle busquedaAnimalesGoogle = new BusquedaAnimalesGoogle();
        System. out. println("pasa1");
        busquedaAnimalesGoogle.busquedaPerro(webDriver);
    }

    @Test
    public void pruebaLogin(){
        Logeo logeo = new Logeo(webDriver);
        logeo.CasoLogin1("nvivas","qanova");
    }
}
