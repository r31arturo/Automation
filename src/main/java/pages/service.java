package pages;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintStream;
import java.net.URL;
import java.net.URLConnection;
import pages.ListaNombres;


public class service {

    ListaNombres listanombre;

    public static void invocaApi(String urlDir) throws IOException {
        URL url = new URL(urlDir);

        //Insert your JSON query request
        String totalEncontrados = "{'query': 'silvergold'}";

        //It change the apostrophe char to double colon char, to form a correct JSON string
        //query=query.replace("'", "\"");

        try{
            //make connection
            URLConnection urlc = url.openConnection();
            //It Content Type is so importan to support JSON call
            urlc.setRequestProperty("Content-Type", "application/xml");
            Msj("Conectando: " + url.toString());
            //use post mode
            urlc.setDoOutput(true);
            urlc.setAllowUserInteraction(false);


            //get result
            BufferedReader br = new BufferedReader(new InputStreamReader(urlc.getInputStream()));
            String l = null;
            while ((l=br.readLine())!=null) {
                Msj(l);
            }
            br.close();


            //buscar el elemento
            //listanombre.getnombre;


        } catch (Exception e){
            Msj("Error ocurrido");
            Msj(e.toString());
        }
    }

    private static void Msj(String texto){
        System.out.println(texto);
    }
}



