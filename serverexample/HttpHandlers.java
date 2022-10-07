package serverexample;
import java.io.OutputStream;
import java.io.IOException;

import com.sun.net.httpserver.HttpHandler;
import com.sun.net.httpserver.HttpExchange;

public class HttpHandlers {
  // does this need to be a public class?
  public static class RootHandler implements HttpHandler {
    // @override ???
    public void handle(HttpExchange exchangeObject) throws IOException {
      String response = "<h1>Started successfully</h1>" + "<h1>Port: " + Main.port + "</h1>";
      exchangeObject.sendResponseHeaders(200, response.length());
      OutputStream os = exchangeObject.getResponseBody();
      os.write(response.getBytes());
      os.close();
    }
  }
}
