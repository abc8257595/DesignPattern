package site.moree.chain;

/**
 * Created by MORE-E on 5/7/2017.
 */
public class FanHandler extends Handler {
    @Override
    public void handleRequest() {
        System.out.println("Fan handler");
        if (successor != null) {
            successor.handleRequest();
        } else {
            System.out.println("Done");
        }
    }
}
