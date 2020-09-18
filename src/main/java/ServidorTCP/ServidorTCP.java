package ServidorTCP;

import java.net.ServerSocket;

public class ServidorTCP {
    ///Atributos
    /**
     * ServerSocket es un Objeto que nos permitirá hacer la comunicacion entre cliente-servidor
     */
    private ServerSocket newServer;

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
            newServer = new ServerSocket(60000);
        }catch (Exception e){
            //Mostrar error asociado
            System.out.println(e.getMessage());
            //salir
            System.exit(1);
        }

    }
}
