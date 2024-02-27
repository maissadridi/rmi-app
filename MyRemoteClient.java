import java.rmi.Naming;

public class MyRemoteClient {
    public static void main(String[] args) {
        try {
            MyRemoteInterface remoteService = (MyRemoteInterface) Naming.lookup("//localhost/MyRemoteServer");
            String result = remoteService.convertString("hello");
            System.out.println("Result: " + result);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
