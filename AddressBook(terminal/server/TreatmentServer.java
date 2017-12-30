import java.rmi.*;
import java.rmi.server.*;
import java.rmi.registry.*;
import java.rmi.server.RMIClassLoader;
import java.util.Properties;
public class TreatmentServer
{
    public static void main(String[] args) {
        try {
            if(System.getSecurityManager() == null)
            System.setSecurityManager(new RMISecurityManager());

            Registry registry = LocateRegistry.createRegistry(1099);
            System.out.println( "Server : Construction of the implementation");
            Properties p = System.getProperties();
            String url = p.getProperty("java.rmi.server.codebase");

            Class ClasseFactory= RMIClassLoader.loadClass(url,"FabTreatmentImpl");

            System.out.println("Factory Object link in the RMIregistry");

            registry.rebind("Factory", (Remote)ClasseFactory.newInstance());

            System.out.println ("Server is Ready!") ;
            System.out.println("Waiting for Client request  ...");

        }
        catch (Exception e) {
            System.out.println("Error linking Factory Object ");
            System.out.println(e.toString());
        }
    }
}