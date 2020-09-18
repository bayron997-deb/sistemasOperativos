package GestorArchivo;

import java.io.*;

public class GestorArchivos {
    //Atributos
    /**
     * Escribir bytes en un fichero
     */
    private FileOutputStream fos;

    /**
     * convierte en objetos y variables los array de bytes leidos de un imputstream
     */
    private ObjectOutputStream oos;

    /**
     * Representacion abstracta de nombre de ruta de archivos y directorios
     */
    private File file;

    //Metodos

    /**
     * Metodo para escribir un archivo en binario
     * @param ruta ruta que se le pasa al escribidor
     */
    public void escribirFichero(String ruta,String contenido){
        //crea un nuevo arhivo con nombre ruta
        file = new File(ruta);
        //Try-Catch para evitar errores
        try{
            //Creamos objeto FileOutputStream pasandole file como parametro
            fos = new FileOutputStream(file);
            //creamos objeto ObjectOutputStream pasandole a fos como parametro
            oos = new ObjectOutputStream(fos);
            //Escribir
            oos.writeByte(Integer.parseInt(contenido));
        } catch (FileNotFoundException e) {
            //errores
        } catch (IOException e) {
            //errores
        }

    }
}
