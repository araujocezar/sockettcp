import java.io.*;
import java.net.*;


public class TCPServer {
        public static void main(String argv[]) throws Exception{
            String fraseCliente, fraseMaiusculo;
            ServerSocket welcomeServer = new ServerSocket(8090);
            
            while(true){
                Socket socketConexao = welcomeServer.accept();
                BufferedReader doCliente = new BufferedReader(new InputStreamReader(socketConexao.getInputStream()));
                DataOutputStream paraCliente = new DataOutputStream(socketConexao.getOutputStream());
                fraseCliente = doCliente.readLine();
                fraseMaiusculo = fraseCliente.toUpperCase() + '\n';
                paraCliente.writeBytes(fraseMaiusculo);
            }
        }    
}
