package pl.devwannabe.polymorphism.using_inheritance;


public class App {
    public static void main(String[] args) {
        Druid druid, druidFalcon, druidWolf;

        druid = new Druid();
        // Upcasting
        druidFalcon = new DruidFalcon();
        druidWolf = new DruidWolf();

        druidFalcon.changeForm();

        // Downcasting
        if (druidFalcon instanceof DruidFalcon) {
            DruidFalcon falcon = (DruidFalcon) druidFalcon;
            falcon.fly();
            falcon.land();
        }
        druidWolf.changeForm();

        // Downcasting
        if (druidWolf instanceof DruidWolf) {
            DruidWolf wolf = (DruidWolf) druidWolf;
            wolf.run();
            wolf.attack();
        }
        druid.changeForm();
    }
}