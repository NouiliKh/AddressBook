import java.rmi.*;
import java.rmi.server.*;

public class FabTreatmentImpl extends UnicastRemoteObject implements  FabTreatmentInterface{

    public FabTreatmentImpl() throws RemoteException {}


    public TreatmentInterface newTreatmentImpl() throws RemoteException {
        return new TreatmentImpl();
    }
}
