/**
 * Класс хендлер, расширяющиц класс TextWebSocketHandler и переопределяющиц один из его методов.
 * Метод проверяет открыта ли сессия, подписался ли клиент на обновление и передает в парсер строку
 * для парсинга.
 */
package ftx.ivvasch.demo;

import ftx.ivvasch.demo.parser.JacksonDataBind;
import org.springframework.web.socket.TextMessage;
import org.springframework.web.socket.WebSocketSession;
import org.springframework.web.socket.handler.TextWebSocketHandler;

public class Handler extends TextWebSocketHandler {

    @Override
    protected void handleTextMessage(WebSocketSession session, TextMessage message) throws InterruptedException {
        if (session.isOpen()) {
            if (message.getPayload().startsWith("{\"type")) {
                System.out.println("Subscription successful");
            }
            if (message.getPayload().startsWith("{\"channel\"")) {
                JacksonDataBind.parseJson(message.getPayload());
            }
        }
    }
}
