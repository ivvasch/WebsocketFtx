package ftx.ivvasch.demo;

public class Ticker {
    private String channel;
    private String market;
    private String type;
    private DataTicker data;


    public Ticker() {
    }

    public Ticker(String channel, String market, String type, DataTicker data) {
        this.channel = channel;
        this.market = market;
        this.type = type;
        this.data = data;
    }

    public String getChannel() {
        return channel;
    }

    public String getMarket() {
        return market;
    }

    public String getType() {
        return type;
    }

    public DataTicker getData() {
        return data;
    }

    @Override
    public String toString() {
        return "Ticker{" +
                "channel='" + channel + '\'' +
                ", market='" + market + '\'' +
                ", update='" + type + '\'' +
                ", dataTicker=" + data +
                '}';
    }
}
