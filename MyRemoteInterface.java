import java.rmi.Remote;
import java.rmi.RemoteException;

public interface MyRemoteInterface extends Remote {
    String convertString(String input) throws RemoteException;
}
