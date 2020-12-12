package ftx.ivvasch.demo.parser;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import ftx.ivvasch.demo.Ticker;

public class JacksonDataBind {

    public static void parseJson(String string) throws InterruptedException {
        ObjectMapper objectMapper = new ObjectMapper();
        Ticker ticker = null;
        try {
            ticker = objectMapper.readValue(string, Ticker.class);
        } catch (JsonProcessingException e) {
            e.printStackTrace();
        }
        System.out.println("----------------> " + ticker.getMarket() + "  "
                + "ask:" + ticker.getData().getAsk()
                + " || bid:" + ticker.getData().getBid());
        Thread.sleep(2000);
    }
}
