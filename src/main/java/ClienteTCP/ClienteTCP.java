package ClienteTCP;

import java.io.BufferedReader;
import java.io.DataOutputStream;
import java.net.Socket;

public class ClienteTCP {
    ///Atributos
    /**
     *Leer texto en una secuencia y la almacena en un buffer de caracteres
     */
    private BufferedReader teclado;
    /**
     * Socket nos permitira recibir/leer datos y para enviar/escribir datos
     */
    private Socket newSocket;
    /**
     * Escribir datos del tipo primitivo
     */
    private DataOutputStream newSalida;
    /**
     * Metodo para ejecutar cliente
     * @param args
     */
    public static void main(String[] args) {
        //mensaje de bienvenida
        System.out.println("Bienvenido cliente");
    }
}
