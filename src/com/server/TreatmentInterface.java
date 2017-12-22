package com.server;
import java.rmi.Remote;
import java.rmi.RemoteException;

public interface TreatmentInterface extends Remote{
    Void addEmployee(Employee emp) throws RemoteException;
    Void updateEmployee(Employee emp) throws RemoteException;
    Void deleteEmployee(Employee emp) throws RemoteException;
    Employee findEmployee(String familyName) throws RemoteException;
}
