package serverexample;
import java.io.IOException;
import java.net.InetSocketAddress;

import com.sun.net.httpserver.HttpServer;


public class HTTPServer {
  private HttpServer server;
  private int port;

  public void Start(int port) {
    try {
      this.port = port;
      server = HttpServer.create(new InetSocketAddress(port), 0);
      server.createContext("/", new HttpHandlers.RootHandler());
      server.setExecutor(null);
      server.start();
      System.out.println("server started at port: " + port);
    } catch (IOException e) {
      e.printStackTrace();
    }
  }

  public void Stop() {
    server.stop(0);
    System.out.println("Server stopped on port: " + port);
  }
}
