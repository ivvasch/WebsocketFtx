/**
 * Запускаем Spring Boot, создаем объект клиента, который, через метод initialize, будет обращаться к серверу и передаем на сервер сообщение
 * с просьбой подписаться на пару BTC/USD. Обрабатываем исключения, которые могут возникнуть в процессе подключения.
 */
package ftx.ivvasch.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.socket.TextMessage;

import java.io.IOException;
import java.util.concurrent.ExecutionException;

@SpringBootApplication
public class FtxWebsocketClientApplication {

    public static void main(String[] args)  {
        SpringApplication.run(FtxWebsocketClientApplication.class, args);
        var myFtxClient = new MyFtxClient();
        try {
            myFtxClient.initialize();
            myFtxClient.getClientSession().sendMessage(new TextMessage("{\"op\": \"subscribe\", \"channel\": \"ticker\", \"market\": \"BTC/USD\"}"));
        } catch (ExecutionException | InterruptedException | IOException e) {
            e.printStackTrace();
        }
    }

}
