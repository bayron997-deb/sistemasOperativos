package Ejecutor;

import ClienteTCP.ClienteTCP;
import ServidorTCP.ServidorTCP;

public class Server {
    //Atributo
    /**
     * Objeto de la clase ServidorTCP
     */
    public static ServidorTCP server = new ServidorTCP();
    /**
     * Metodo para ejecutar Server
     * @param args
     */
    public static void main(String[] args) {
        //mensaje de bienvenida
        System.out.println("Bienvenido Servidor");
        server.servidorTCP();
    }
}
