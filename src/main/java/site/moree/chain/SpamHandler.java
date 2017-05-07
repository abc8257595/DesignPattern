package site.moree.chain;

/**
 * Created by MORE-E on 5/7/2017.
 */
public class SpamHandler extends Handler {
    @Override
    public void handleRequest() {
        System.out.println("Spam handler");
        if (successor != null) {
            successor.handleRequest();
        }
    }
}
