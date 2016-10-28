package delightex.client;

import com.google.gwt.core.client.EntryPoint;
import com.google.gwt.http.client.*;
import com.google.gwt.user.client.Window;
import delightex.common.Util;

public class GwtEntryPoint implements EntryPoint {
  public void onModuleLoad() {
    Window.alert(Util.getValue());
    RequestBuilder builder = new RequestBuilder(RequestBuilder.GET, "/rpc");
    builder.setCallback(new RequestCallback() {
      public void onResponseReceived(Request request, Response response) {
        Window.alert(response.getText());
      }

      public void onError(Request request, Throwable throwable) {
      }
    });
    try {
      builder.send();
    } catch (RequestException e) {
      // ignore
    }
  }
}
