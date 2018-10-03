package pl.devwannabe.polymorphism.using_interfaces;


public class App {
    public static void main(String[] args) {

        Druid druidMan, druidFalcon, druidWolf;

        druidFalcon = new DruidFalcon();
        druidWolf = new DruidWolf();
        druidMan = new DruidMan();

        druidFalcon.changeForm();
        if (druidFalcon instanceof DruidFalcon) {
            DruidFalcon falcon = (DruidFalcon) druidFalcon;
            falcon.fly();
            falcon.land();
        }
        druidWolf.changeForm();
        if (druidWolf instanceof DruidWolf) {
            DruidWolf wolf = (DruidWolf) druidWolf;
            wolf.run();
            wolf.attack();
        }
        druidMan.changeForm();
        if (druidMan instanceof DruidMan) {
            DruidMan man = (DruidMan) druidMan;
            man.walk();
        }
    }
}