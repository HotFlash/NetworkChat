import chat.MyServer;

public class ServerApp {

    private static final int PORT = 8188;

    public static void main(String[] args) {
        new MyServer().start(PORT);
    }
}