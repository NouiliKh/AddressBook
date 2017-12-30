import java.rmi.Remote;
import java.rmi.RemoteException;

public interface TreatmentInterface extends Remote{
    Void addEmployee(String InstitutionName, Employee emp) throws RemoteException;
    Void updateEmployee(String InstitutionName,Employee emp) throws RemoteException;
    Void deleteEmployee(String InstitutionName,Integer cin) throws RemoteException;
    Employee findEmployee(String InstitutionName,Integer cin) throws RemoteException;
}
