package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.junit.Assert;

public class page {

    WebDriver driver;
    By pathCategorias = By.xpath("//header//a[text()='Categorías']");

    public page(WebDriver driver){
        this.driver = driver;
    }

    public void buscarCategoria(String categoria,String subCategoria){
        //localizador del la categoria y de l sub categoria
        By category = By.xpath("//a[text()='"+categoria+"']");
        By subCategory = By.xpath("//a[text()='"+subCategoria+"']");

        //despliega menu de page
        common.waitToAndClick(driver,pathCategorias);
        //espera y despliega el menu de sub page
        common.waitToAndClick(driver,category);
        //espera y selecciona la categoria buscada
        common.waitToAndClick(driver,subCategory);

    }

    public void validarResultados(String categoria){
        //localizacion del titulo de la categoria
        By titleCategory = By.xpath("//h1[contains(@class,'title')]");
        //obtiene el texto a comparar
        String textToCompare = driver.findElement(titleCategory).getText();

        //valida el texto
        Assert.assertEquals(categoria,textToCompare);

        //localizacion del numero de resultados conseguidos
        By resultadosPath = By.xpath("//div[@class='quantity-results']");
        //consigue los resultados y los imprime en pantalla
        String resultadosText = driver.findElement(resultadosPath).getText();
        System.out.print("la categoria "+categoria+" tiene "+resultadosText);

    }

    public void filtrarCuidad(String ciudad){
        //localizacion del foltro de ciudad
        By filtroCiudad = By.xpath("//dl[@id='id_state']//span[text()='"+ciudad+"']");

        //filtrar ciudad
        driver.findElement(filtroCiudad).click();
    }

    public void compararPublicacion(){
        //obtener el string del titulo de la publicacion
        String titlePublicAntes = driver.findElement(By.xpath("//h2/a/span")).getText();
        //obtener el precio de la publicacion
        String pricePublicAntes = driver.findElement(By.xpath("//span[@class='price__fraction']")).getText();

        //ingreso a la publicacion
        driver.findElement(By.xpath("//h2/a/span")).click();

        //comparo el titulo con la publicacion abierta
        Assert.assertEquals(titlePublicAntes,driver.findElement(By.xpath("//header/h1")).getText());
        //comparo los precios
        Assert.assertEquals(pricePublicAntes,driver.findElement(By.xpath("//fieldset//span[@class='price-tag-fraction']")).getText());


    }
}
