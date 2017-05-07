package site.moree.chain;

/**
 * Created by MORE-E on 5/7/2017.
 */
public class ChainPattern {
    public static void main(String[] args) {
        Handler spam = new SpamHandler();
        Handler fan = new FanHandler();

        // 设置责任链
        spam.setSuccessor(fan);
        fan.setSuccessor(null);

        spam.handleRequest();
    }
}
