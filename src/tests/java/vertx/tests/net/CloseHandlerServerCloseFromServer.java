package vertx.tests.net;

/**
 * @author <a href="http://tfox.org">Tim Fox</a>
 */
public class CloseHandlerServerCloseFromServer extends CloseHandlerServer {
  public CloseHandlerServerCloseFromServer() {
    closeFromServer = true;
  }
}
