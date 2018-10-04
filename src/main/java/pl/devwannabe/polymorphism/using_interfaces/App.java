package pl.devwannabe.polymorphism.using_interfaces;

public class App {

    public static void main(String[] args) {

        Falcon falcon = new DruidFalcon();
        Wolf wolf = new DruidWolf();
        Man man = new DruidMan();

        falcon.changeForm();
        falcon.fly();
        falcon.land();

        wolf.changeForm();
        wolf.run();
        wolf.attack();

        man.changeForm();
        man.walk();

    }

}