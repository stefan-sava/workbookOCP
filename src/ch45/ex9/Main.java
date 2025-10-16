package ch45.ex9;

import java.util.ArrayList;
import java.util.List;

public class Main {
     static void main(String[] args) {
        List<Person> list = new ArrayList<>();
        list.add(new Person("alex", 30));
        list.add(new Person("bob", 25));
        list.add(new Person("john", 35));
        list.add(new Person("ivan", 50));
        for(Person p : list){
            System.out.println(p);
        }
    }
}
