package site.moree.facade;

/**
 * Created by MORE-E on 5/6/2017.
 * 外观模式，引用了所需的构件，封装好构件的行为，方便调用
 */
public class HomeTheaterFacade {
    private Amplifier amp;
    private Player player;

    public HomeTheaterFacade() {
        amp = new Amplifier();
        player = new Player();
    }

    public HomeTheaterFacade(Amplifier amp, Player player) {
        this.amp = amp;
        this.player = player;
    }

    public void watchMovie() {
        System.out.println("Get ready to watch a movie...");
        amp.on();
        player.play();
    }

    public void endMovie() {
        System.out.println("Shutting movie theater down...");
        amp.off();
        player.stop();
    }
}
