import java.util.LinkedList;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class FunctionalProgrammingExample {

    public static void main(String[] args) {
        //strumienie
        List<Integer> ints = new LinkedList<>();
        for (int i = 0; i < 100; i++) {
            ints.add(i);
        }
        //IntStream - zwraca nam wartości z danego zakresu, np. od 0 do 100

        ints = ints.stream().filter(n -> n % 2 ==0).collect(Collectors.toList());
        System.out.println(ints);

    //pierwszy sposób = dłuższy. Zastąpiliśmy go strumieniem
        /*for (int i = 0; i < ints.size(); i++) {
            if (ints.get(i) % 2 ==0) { //jeżeli dzieli się przez 2 to chcę usunąć z tablicy ten element
                ints.remove(i);
                i--; //dodajemy i-- bo usunie nam się element z tablicy, przesuną nam się obiekty i przejdzie do kolejnego, zamiast wziąć od razu kolejny
            }
        }
        System.out.println(ints);*/
    }

}
