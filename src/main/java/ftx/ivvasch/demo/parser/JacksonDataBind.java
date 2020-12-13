/**
 * Собственно сам парсер и обработчик переданных строк с сервера. Создаем объект ObjectMapper и через него считываем в переменную класса Ticker все данные.
 * Передаем объект в класс отображения необходимых данных.
 */
package ftx.ivvasch.demo.parser;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import ftx.ivvasch.demo.Ticker;
import ftx.ivvasch.demo.ViewTicker;

public class JacksonDataBind {

    public static void parseJson(String string) throws InterruptedException {
        ObjectMapper objectMapper = new ObjectMapper();
        Ticker ticker = null;
        try {
            ticker = objectMapper.readValue(string, Ticker.class);
        } catch (JsonProcessingException e) {
            e.printStackTrace();
        }
        ViewTicker.viewTicker(ticker);
    }
}
