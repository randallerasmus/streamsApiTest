import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class main {
    public static void main(String[] args) {

        // Create the ArrayList with Values
        List<String> listTest = new ArrayList<>();
        // Adding values to the list
        listTest.add("Jonika");
        listTest.add("Tim");
        listTest.add("Jake");
        listTest.add("Butch");
        listTest.add("Joseph");
        // Display the list
        System.out.println(listTest);

        // Now the requirement is to the remove the value " Jonika in the list
        // and display the new list without the value "Jonika

        // Step 1
        // Create a new list to hold the
        List<String> newList = new ArrayList<>();
        for (int i = 0; i < listTest.size(); i++) {
            //do some crud operations on the list
            String newValue = listTest.get(i);
            if (newValue.equalsIgnoreCase("jonika")) {
                newList.add(newValue);
            }
        }
        listTest.removeAll(newList);
        System.out.println(listTest);

    }
}
