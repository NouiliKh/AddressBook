package com.server;
import java.rmi.*;
import java.rmi.server.*;
import java.rmi.registry.*;
public class TreatmentServer
{
    public static void main(String[] args) {
        try {
            Registry registry = LocateRegistry.createRegistry(1099);
            System.out.println( "Server : Construction of the implementation");
            FabTreatmentImpl fab=new FabTreatmentImpl();
            System.out.println("Factory Object link in the RMIregistry");
            registry.rebind ("Factory",fab);
            System.out.println ("Server is Ready!") ;
            System.out.println("Waiting for Client request  ...");
        }
        catch (Exception e) {
            System.out.println("Error linking Factory Object ");
            System.out.println(e.toString());
        }
    }
}
