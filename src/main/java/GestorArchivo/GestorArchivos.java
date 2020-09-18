package GestorArchivo;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class GestorArchivos {
    //Metodos
    /**
     * Crea un archivo en la ruta especificada, y con el contenido ingresado
     * @param ruta Ruta donde se va a crear el archivo
     */
    public void crearArchivo(String ruta, String contenido){
        Path archivo = Paths.get(ruta);
        try{
            Files.write(archivo, contenido.getBytes());
        }catch(IOException e){
        }
    }

    /**
     * Método que retorna un String con el contenido de un archivo, o retorna un String vacío si no existe
     * @param ruta Ruta del archivo a leer
     * @return String con el contenido del archivo
     */
    public String leerArchivo(String ruta){
        Path archivo = Paths.get(ruta);
        String contenido="";

        try{
            contenido = new String(Files.readAllBytes(archivo));
        } catch(IOException e){
        }

        return contenido;
    }
    /**
     * Elimina el archivo de la ruta especificada, siempre que no ocurra alguna excepción
     * @param ruta Ruta del archivo que se quiere borrar
     */
    public void eliminarArchivo(String ruta){
        Path archivo = Paths.get(ruta);

        try{
            Files.deleteIfExists(archivo);
        } catch (IOException e){
        }
    }
}
