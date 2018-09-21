package pl.devwannabe.generics.generic_collection;

import java.util.ArrayList;
import java.util.List;


public class GenericCollectionApp {
    public static void main(String[] args) {

        List animals = new ArrayList();

        animals.add("dog");
        animals.add("cat");
        animals.add(new GenericCollectionApp());

        for (Object object: animals) {
            System.out.println(object);
            System.out.println((String)object);
        }

        List<String> humans = new ArrayList<>();

        humans.add("Gregor Clegane");
        humans.add("Tom Cruise");
        humans.add("Jon Snow");

        for (String str: humans) {
            System.out.println(str);
        }
    }
}