
import java.util.Scanner;





public class RMIClientMain 
{
     public static void main(String[] args) 
    {
        try {
            RmiCommunicationClient wsc = new RmiCommunicationClient();
            Scanner sc = new Scanner(System.in);

                System.out.println("Ingrese su usuario");
                String Usr = sc.next();
                System.out.println("Ingrese contraseña");
                String psw = sc.next();
            String ses = wsc.getSesion(Usr, psw);
            
              System.out.println(" resultado de sesion por servidor: " + ses);

     
        } catch (Exception ex) {
            ex.printStackTrace();
             System.err.println("Connection error the server is not responding.");
        }
    }
}
