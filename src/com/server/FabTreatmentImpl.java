package com.server;
import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;

public class FabTreatmentImpl extends UnicastRemoteObject implements  FabTreatmentInterface{

    protected FabTreatmentImpl() throws RemoteException {
    }

    @Override
    public TreatmentInterface newTreatmentImpl() throws RemoteException {
        return new TreatmentImpl();
    }
}
