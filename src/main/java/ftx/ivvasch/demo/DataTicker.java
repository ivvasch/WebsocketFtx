/**
 * Класс, который принимае в себя объект с данными по конкретной паре.
 */
package ftx.ivvasch.demo;

public class DataTicker {
    private String bid;
    private String ask;
    private String bidSize;
    private String askSize;
    private String last;
    private String time;

    public DataTicker() {
    }

    public DataTicker(String bid, String ask, String bidSize, String askSize, String last, String time) {
        this.bid = bid;
        this.ask = ask;
        this.bidSize = bidSize;
        this.askSize = askSize;
        this.last = last;
        this.time = time;
    }

    public String getBid() {
        return bid;
    }

    public String getAsk() {
        return ask;
    }

    public String getBidSize() {
        return bidSize;
    }

    public String getAskSize() {
        return askSize;
    }

    public String getLast() {
        return last;
    }

    public String getTime() {
        return time;
    }

    @Override
    public String toString() {
        return "DataTicker{" +
                "ask:'" + ask + '\'' +
                ", bid:'" + bid + '\'' +
                '}';
    }
}
