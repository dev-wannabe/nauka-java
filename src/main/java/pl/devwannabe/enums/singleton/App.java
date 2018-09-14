package pl.devwannabe.enums.singleton;

public class App {

    public static void main(String[] args) {

        Player player = new Player("player1",0);
        System.out.println(player);
        PlayerUtilsSingleton.INSTANCE.levelUp(player);
        System.out.println(player);

    }
}
