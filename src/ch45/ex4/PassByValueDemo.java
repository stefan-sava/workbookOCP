package ch45.ex4;

import java.util.Arrays;

public class PassByValueDemo {
    public static void modify(String name){
        System.out.println("Inside modify method, before changing " + name);
        name = name.replace("te", "be");
        System.out.println("Inside modify method, after changing " + name);

    }

    public static void modifyArray(int[] array){
        System.out.println("Inside modifyArray method, before changing: " + Arrays.toString(array));
        array[0] = 0;
        System.out.println("Inside modifyArray method, after changing: " + Arrays.toString(array));
    }

    public static void main(String[] args){
        String name = new String("test");
        int[] arr = new int[]{1,2,3};

        System.out.println("Before modifying the string: " + name );
        modify(name);
        System.out.println("After modifying the string: " + name);

        System.out.println("Before modifying the array: " + Arrays.toString(arr));
        modifyArray(arr);
        System.out.println("After modifying the array: " + Arrays.toString(arr));

    }

}
