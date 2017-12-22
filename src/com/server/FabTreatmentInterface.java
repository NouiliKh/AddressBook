package com.server;
import java.rmi.Remote;
import java.rmi.RemoteException;

public interface FabTreatmentInterface extends Remote {
    public TreatmentInterface newTreatmentImpl() throws RemoteException;
}
