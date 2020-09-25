package designpatterns.behavioral.observer;

public class ObserverDemo {
    public static void runDemo() {
        Stock stockA = new Stock("A",5f);
        StatusBar statusBar = new StatusBar();
        StockListView stockListView = new StockListView();

        statusBar.addStock(stockA);
        stockListView.addStock(stockA);

        stockA.addObserver(statusBar);
        stockA.addObserver(stockListView);

        statusBar.show();
        stockListView.show();
        stockA.setPrice(5.01f);

    }
}
