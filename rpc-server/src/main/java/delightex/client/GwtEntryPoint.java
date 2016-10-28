package delightex.client;

import com.google.gwt.core.client.EntryPoint;
import com.google.gwt.user.client.Window;
import delightex.common.Util;

public class GwtEntryPoint implements EntryPoint {
  public void onModuleLoad() {
    Window.alert("Loaded! " + Util.getValue());
  }
}
