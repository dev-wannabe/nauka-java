package pl.devwannabe.generics.generic_method;

public class App {

    public static void main(String[] args) {
        Integer[] nums = {1, 2, 3, 4, 5};
        Character[] chars = {'a', 'b', 'c', 'd', 'e'};

        displayElements(nums);
        displayElements(chars);
    }

     static  <T> void displayElements(T[] array) {
        for (T element: array) {
            System.out.print(element);
        }
        System.out.println();
    }

//     static void displayElements(Integer[] nums) {
//        for (Integer element: nums) {
//            System.out.print(element);
//        }
//        System.out.println();
//    }
//
//     static void displayElements(Character[] chars) {
//        for (Character element: chars) {
//            System.out.print(element);
//        }
//        System.out.println();
//    }

}