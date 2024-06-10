import java.rmi.Remote;
import java.rmi.RemoteException;

public interface ConversorRemoto extends Remote {
    double farengheit (double num ) throws RemoteException;
    double celsius (double num ) throws RemoteException;
}
