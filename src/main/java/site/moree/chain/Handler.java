package site.moree.chain;

/**
 * Created by MORE-E on 5/7/2017.
 */
public abstract class Handler {
    protected Handler successor;
    public abstract void handleRequest();

    public void setSuccessor(Handler successor) {
        this.successor = successor;
    }
}
