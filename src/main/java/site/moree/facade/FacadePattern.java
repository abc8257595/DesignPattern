package site.moree.facade;

/**
 * Created by MORE-E on 5/6/2017.
 * 对外隐藏了部件的细节，只提供简化后的接口，有利于降低耦合
 */
public class FacadePattern {
    public static void main(String[] args) {
        HomeTheaterFacade theaterFacade = new HomeTheaterFacade();
        theaterFacade.watchMovie();
        System.out.println("--------------------------------------------------------------------");
        theaterFacade.endMovie();
    }
}
