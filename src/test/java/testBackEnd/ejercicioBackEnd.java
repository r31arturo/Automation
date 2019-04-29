package testBackEnd;

import org.json.simple.JSONObject;
import org.junit.Before;
import org.junit.Test;
import pages.service;

import java.io.IOException;
import java.util.HashMap;


public class ejercicioBackEnd {

    @Test
    //no funciona
    public void buscarProducto() throws IOException {
        String url = "https://api.mercadolibre.com/sites/MLA/search?q=silvergold";

        service.invocaApi(url);


    }


}
