package testClass;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.WebDriver;
import page.Google;

import java.util.concurrent.TimeUnit;

public class BusquedaAnimalesGoogle {

    private Google google;

    public void busquedaPerro(WebDriver webDriver){
        System. out. println("pasa2");
        google = new Google(webDriver);
        webDriver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        google.ingresarBusqueda("Perro");
        System. out. println("pasa3");
        google.clickBtnBuscar();
        System. out. println("pasa4");
        //.setAttribute('visibility', 'true');");


    }

}
