package testFrontEnd;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import pages.page;
import pages.common;

import java.util.Properties;

public class ejercicioDos {

    WebDriver driver;
    utils.constantes constantes;
    pages.common common;
    page page;
    Properties p = new Properties();


    @Before
    public void setup_y_ruta()throws Exception {

        //cambiar la ruta del siguiente parametro por donde se coloque el archivo config,
        //igualmente cambiar la ruta del path del WebDriver en utils/constantes
        System.setProperty(constantes.driverWeb, constantes.pathDriverWeb);


        driver = new ChromeDriver();
        common = new common(driver);
        page = new page(driver);

        //ingreso a Mercadolibre
        common.openPage(constantes.url);


    }

    @Test
    public void testIngresarCompararPublicacion() {
        //busca la categoria y ingresar en ella
        page.buscarCategoria(constantes.hogar,constantes.climatizacion);
        //verifica el titulo de la categoria ingresad y imprime los resultados obtenidos
        page.filtrarCuidad(constantes.capital);
        //ingresar en la primera publicacion y verificar los datos de la publicacion antes y despues de entrar
        page.compararPublicacion();

    }

    @After
    public void cerrar_ventana(){
        common.closePage();
    }
}
