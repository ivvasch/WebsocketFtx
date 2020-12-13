/**
 * Из полученного объекта извлекаем необходимые нам данные и выводим в консоль. Делаем задержку в 2 сек, для более комфортного отображения.
 */
package ftx.ivvasch.demo;

public class ViewTicker {

    public static void viewTicker(Ticker ticker) throws InterruptedException {
        System.out.println("----------------> " + ticker.getMarket() + "  "
                + "ask:" + ticker.getData().getAsk()
                + " || bid:" + ticker.getData().getBid());
        Thread.sleep(2000);
    }
}
