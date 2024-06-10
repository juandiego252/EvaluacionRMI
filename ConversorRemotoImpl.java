import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;

public class ConversorRemotoImpl extends UnicastRemoteObject implements  ConversorRemoto {

    protected ConversorRemotoImpl() throws RemoteException {
        super();
    }

    @Override
    public double farengheit(double num) throws RemoteException {
        return (num - 32) / 1.8;
    }

    @Override
    public double celsius(double num) throws RemoteException {
        return (num * 9/5) + 32;
    }
}
