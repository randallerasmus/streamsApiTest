import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class main {
    public static void main(String[] args) {

        List<Integer> listTest = new ArrayList<>();
        listTest.add(10);
        listTest.add(24);
        listTest.add(8);
        listTest.add(13);
        listTest.add(7);
        System.out.println(listTest);

        // Getting the even number in the list
        List<Integer> newList = new ArrayList<>();

        for (Integer numList : listTest) {
            if (numList % 2 == 0) {
                newList.add(numList);
            }
        }
        System.out.println(newList);

        //Stream Api to get the even numbers in the list
        List<Integer> streamList = listTest.stream().filter(num ->num %2 ==0).collect(Collectors.toList());
        System.out.println(streamList);
    }
}
