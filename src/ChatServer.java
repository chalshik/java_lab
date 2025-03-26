import java.io.BufferedInputStream;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.ServerSocket;
import java.net.Socket;

public class ChatServer {
    public static void main(String[] args) throws IOException {
        ServerSocket ss = new ServerSocket(499);
        Socket s = ss.accept();
        System.out.println("Good");
        InputStreamReader in = new InputStreamReader(s.getInputStream());
        BufferedReader bn = new BufferedReader(in);

        String msg = bn.readLine();
        System.out.println(msg);
    }
}
