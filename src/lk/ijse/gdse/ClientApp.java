package lk.ijse.gdse;

import java.io.IOException;
import java.net.Socket;

public class ClientApp {
    public static void main(String[] args) throws IOException {
        int PORT = 8000;
        Socket socket = new Socket("localhost",PORT);
    }
}
