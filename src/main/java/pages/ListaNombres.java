package pages;



import java.util.ArrayList; //Los import deben ir siempre al principio antes de declarar la clase



//Esta clase representa una lista de nombres manejada con la clase ArrayList de Java

public class ListaNombres {

    private String nombreDeLaLista; //Establecemos un atributo nombre de la lista

    private ArrayList<String> listadenombres; //Declaramos un ArrayList que contiene objetos String

    public ListaNombres (String nombre) {    //Constructor: crea una lista de nombres vacía

        nombreDeLaLista = nombre;

        listadenombres = new ArrayList<String>(); //Creamos el objeto de tipo ArrayList

    } //Cierre del constructor



    public void addNombre (String valor_nombre) { listadenombres.add (valor_nombre); } //Cierre del método



    public String getNombre (int posicion) { //Método

        if (posicion >= 0 && posicion < listadenombres.size() ) {

            return listadenombres.get(posicion); }

        else { return "No existe nombre para la posición solicitada";}

    } //Cierre del método



    public int getTamaño () { return listadenombres.size(); } //Cierre del método



    public void removeNombre (int posicion) {  //Método

        if (posicion >= 0 && posicion < listadenombres.size() ) {

            listadenombres.remove(posicion); }

        else { } //else vacío. No existe nombre para la posición solicitada, no se ejecuta ninguna instrucción

    } //Cierre del método removeNombre

} //Cierre de la clase

