
/**
 *
 * @author Cézar Rômulo
 */
import java.io.*;
import java.net.*;


public class TCPCliente {
    public static void main(String argv[]) throws Exception{
        String frase, fraseModificada;
        BufferedReader doUsuario = new BufferedReader(new InputStreamReader(System.in));
        Socket clienteSocket = new Socket("localhost", 8090);
        DataOutputStream paraServidor = new DataOutputStream(clienteSocket.getOutputStream());
        BufferedReader doServidor = new BufferedReader(new InputStreamReader(clienteSocket.getInputStream()));
        frase = doUsuario.readLine();
        paraServidor.writeBytes(frase + '\n');
        fraseModificada = doServidor.readLine();
        System.out.print("DO SERVIDOR: "+ fraseModificada);
        clienteSocket.close();
        
    }
    
}
