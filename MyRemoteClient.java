import java.rmi.Naming;

public class MyRemoteClient {
    public static void main(String[] args) {
        try {
            MyRemoteInterface remoteService = (MyRemoteInterface) Naming
                    .lookup("C:\\Users\\Maissa\\Desktop\\rmi\\rmi-app\\MyRemoteInterface.java");
            String result = remoteService.convertString("hello");
            System.out.println("Result: " + result);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
