package designpatterns.behavioral.chainofresponsibilities;

public class DataReader{
    private Handler handler;

    public DataReader(Handler handler) {
        this.handler = handler;
    }

    public void handle(DataFile d){
        handler.handle(d);
    }
}
