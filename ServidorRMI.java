import java.rmi.RemoteException;
import java.rmi.registry.LocateRegistry;
import java.rmi.registry.Registry;

public class ServidorRMI {
    public static void main(String[] args) {
        try {
            ConversorRemoto objetoRemoto = new ConversorRemotoImpl();
            Registry registro = LocateRegistry.createRegistry(1099);
            registro.rebind("ConversorRemoto", objetoRemoto);
            System.out.println("Servidor creado con exito!");
        }catch (RemoteException e){
            throw new RuntimeException(e);
        }
    }
}
