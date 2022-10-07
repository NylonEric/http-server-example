package serverexample;

public class Main {
  public static int port = 4000;
  public static void main(String[] args) {
    HTTPServer httpServer = new HTTPServer();
    httpServer.Start(port);
  }
}
