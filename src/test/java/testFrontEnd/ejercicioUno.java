package testFrontEnd;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import pages.page;
import pages.common;
import utils.constantes;
import java.util.Properties;



public class ejercicioUno {

    WebDriver driver;
    constantes constantes;
    common common;
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
    public void testCategoriaHogar() {
        //busca la categoria y ingresar en ella
        page.buscarCategoria(constantes.hogar,constantes.climatizacion);
        //verifica el titulo de la categoria ingresad y imprime los resultados obtenidos
        page.validarResultados(constantes.climatizacion);

    }

    @Test
    public void testCategoriaTegnologia() {
        //busca la categoria y ingresar en ella
        page.buscarCategoria(constantes.tecnologia,constantes.celulares);
        //verifica el titulo de la categoria ingresad y imprime los resultados obtenidos
        page.validarResultados(constantes.celulares);
    }

    @Test
    public void testCategoriaBelleza() {
        //busca la categoria y ingresar en ella
        page.buscarCategoria(constantes.belleza,constantes.perfumes);
        //verifica el titulo de la categoria ingresad y imprime los resultados obtenidos
        page.validarResultados(constantes.perfumes);
    }

    @Test
    public void testCategoriaHerramientas() {
        //busca la categoria y ingresar en ella
        page.buscarCategoria(constantes.herramientas,constantes.textil);
        //verifica el titulo de la categoria ingresad y imprime los resultados obtenidos
        page.validarResultados(constantes.textil);
    }

    @Test
    public void testCategoriaJuguetes() {
        //busca la categoria y ingresar en ella
        page.buscarCategoria(constantes.juguetes,constantes.cuarto);
        //verifica el titulo de la categoria ingresad y imprime los resultados obtenidos
        page.validarResultados(constantes.cuarto);
    }

    @After
    public void cerrar_ventana(){
        common.closePage();
    }
}
