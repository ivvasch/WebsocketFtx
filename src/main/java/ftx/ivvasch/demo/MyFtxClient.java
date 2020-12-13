/**
 *
 */
package ftx.ivvasch.demo;
import org.springframework.web.socket.WebSocketHttpHeaders;
import org.springframework.web.socket.WebSocketSession;
import org.springframework.web.socket.client.WebSocketClient;
import org.springframework.web.socket.client.standard.StandardWebSocketClient;

import java.net.URI;
import java.util.concurrent.ExecutionException;

public class MyFtxClient {

    public static final String WSS_FTX_COM_WS = "wss://ftx.com/ws/";
    private WebSocketSession clientSession;
    WebSocketClient webSocketClient;

    public MyFtxClient() {
        webSocketClient = new StandardWebSocketClient();
    }

    public void initialize() throws ExecutionException, InterruptedException {
        this.clientSession = webSocketClient.doHandshake(new Handler(), new WebSocketHttpHeaders(), URI.create(WSS_FTX_COM_WS)).get();
    }

    public WebSocketSession getClientSession() {
        return clientSession;
    }
}