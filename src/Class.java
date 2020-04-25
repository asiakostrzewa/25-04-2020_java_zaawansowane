import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class Class {

    public static void main(String[] args) {
        List<Person> list = new ArrayList<>();
        list.add(new Person("Adam", 20));
        list.add(new Person("Zenon", 24));
        list.add(new Person("Adam", 21));
        list.add(new Person("Ania", 21));
        list.add(new Person("Bartosz", 28));

        System.out.println(list.toString());
        Collections.sort(list); //operacja in situ; na wyjściu mamy posortowaną listę według zdefiniowanego comparabla
        System.out.println(list.toString());
        list.sort(new PersonComparator());
        System.out.println(list.toString());
    }
}
