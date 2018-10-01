package pl.devwannabe.dependency_injection;

public class DependencyInjectionDemo {

    public static void main(String[] args) {

        Quest saveThePrincess = new Quest("Save the princess");
        Quest killDragon = new Quest("Kill the dragon");

        Knight lancelot = new Knight("Lancelot", 29, saveThePrincess);
        Knight percival = new Knight("Percival",31);

        percival.setQuest(killDragon);

        System.out.println(lancelot);
        System.out.println(percival);
    }

}
