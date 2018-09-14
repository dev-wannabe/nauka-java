package pl.devwannabe.enums.singleton;

public class Player {

    String name;
    Integer level;

    public Player(String name, Integer level) {
        this.name = name;
        this.level = level;
    }

    @Override
    public String toString() {
        return "Player{" +
                "name='" + name + '\'' +
                ", level=" + level +
                '}';
    }
}
