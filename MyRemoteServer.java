import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;

public class MyRemoteServer extends UnicastRemoteObject implements MyRemoteInterface {
    protected MyRemoteServer() throws RemoteException {
        super();
    }

    @Override
    public String convertString(String input) throws RemoteException {
        return input.toUpperCase(); // exemple de traitement : conversion en majuscules
    }

    public static void main(String[] args) {
        try {
            MyRemoteServer server = new MyRemoteServer();
            // démarrer le serveur RMI
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
