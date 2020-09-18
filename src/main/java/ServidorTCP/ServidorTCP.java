package ServidorTCP;

import java.io.DataInputStream;
import java.net.ServerSocket;
import java.net.Socket;

public class ServidorTCP {
    ///Atributos
    /**
     * ServerSocket es un Objeto que nos permitirá hacer la comunicacion entre cliente-servidor
     */
    private ServerSocket newServer;
    /**
     * Socket nos permitira recibir/leer datos y para enviar/escribir datos
     */
    private Socket newSocket;

    /**
     * Metodo main que ejecutara el programa
     * @param args
     */
    public static void main(String[] args) {
        //Imprime un mensaje
        System.out.println("Bienvenido al servidor TCP");
    }

    /**
     * Metodoq que tendra todos los procedimientos que hace un servidorTCP
     */
    public void servidorTCP() {

        //Try-Catch para evitar posibles errores
        try {
            //Dejamos el objeto en el puerto de comunicacion 60000 (tiene un amplio rango de puertos)
            newServer = new ServerSocket(60000);
            //Escucha para establecer una conexion a este socket
            newSocket = newServer.accept();
            //Leer y escribir datos en el socket
            DataInputStream newEntrada = new DataInputStream(newSocket.getInputStream());
        }catch (Exception e){
            //Mostrar error asociado
            System.out.println(e.getMessage());
            //salir
            System.exit(1);
        }

    }
}
