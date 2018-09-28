package pl.devwannabe.equals_hashcode;

import java.util.HashMap;
import java.util.Map;


public class HashCodeDemo {

    public static void main(String[] args) {

        Cat cat1 = new Cat("cat1", "black", 3, true);
        Cat cat2 = new Cat("cat2", "white", 5, true);
        Cat cat3 = new Cat("cat3", "grey", 2, true);
        Cat cat4 = new Cat("cat4", "mixed", 1, false);

        Map<Cat, String> catOwners = new HashMap<>();
        catOwners.put(cat1, "Owner1");
        catOwners.put(cat2, "Owner2");
        catOwners.put(cat3, "Owner3");
        catOwners.put(cat4, "Owner4");

        System.out.println(cat1.hashCode());
        System.out.println(cat2.hashCode());
        System.out.println(cat3.hashCode());
        System.out.println(cat4.hashCode());

        String catOwner = catOwners.get(cat2);
        System.out.println(catOwner);

    }

}
