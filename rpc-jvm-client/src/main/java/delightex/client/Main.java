package delightex.client;

import com.turbomanage.httpclient.*;
import delightex.common.Util;

public class Main {
  private static final String URL = "http://localhost:8080";

  public static void main(String[] args) {
    System.out.println(Util.getValue());
    BasicHttpClient client = new BasicHttpClient(URL);
    HttpRequest req = new HttpGet("/rpc", null);
    HttpResponse resp  = client.execute(req);
    System.out.println(resp.getBodyAsString());
  }
}
