package designpatterns.behavioral.chainofresponsibilities;

public abstract class Handler {
    private Handler next;

    public Handler(Handler next) {
        this.next = next;
    }

    public void handle(DataFile d){
        if(doHandle(d)){
            return;
        }

        if (this.next != null)
        {
            next.handle(d);
        }
    }
    public abstract boolean doHandle(DataFile d);

}
