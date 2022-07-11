package it.uniroma2.pernasetti;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Main {

    public static void main(String[] args) {

        List<String> myList = new ArrayList<>();
        if (args.length > 1) {
            for (int i = 0; i < args.length; i++) {
                Collections.addAll(myList, args[i]);
            }

            Collections.sort(myList, Collections.reverseOrder());

            System.out.println(myList);
        }
    }
}
