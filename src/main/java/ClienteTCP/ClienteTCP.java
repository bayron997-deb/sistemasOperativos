package ClienteTCP;

import java.io.BufferedReader;
import java.io.DataOutputStream;
import java.io.InputStreamReader;
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
    
    //Constructor
    public ClienteTCP() {
    }

    /**
     * Metodo de procedimientos de cliente
     */
    public void clienteTCP(){
        //lectura de datos
        teclado = new BufferedReader(new InputStreamReader(System.in));
        //Try-Catch para errores
        try{
            //nueva conexion desde el host "" en el puerto ""
            newSocket = new Socket("127.0.0.1",60000);
            //Vincular socket con salida para escribir y leer datos
            newSalida = new DataOutputStream(newSocket.getOutputStream());
            //Loop para leer datos
            while (true){
                newSalida.writeUTF(String.valueOf(teclado.readLine()));
            }
        }catch (Exception e){
            //Mostrar error asociado
            System.err.println(e.getMessage());
            //salida
            System.exit(1);
        }
    }
}
