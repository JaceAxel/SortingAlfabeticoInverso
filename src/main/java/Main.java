import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Main {

    public static void main(String[] args) {

        List<String> myList = new ArrayList<String>();
        if (args.length > 1) {
            for (int i = 0; i < args.length; i++) {
                myList.add(args[i]);
            }

            Collections.sort(myList);
            Collections.reverse(myList);

            System.out.println(myList);
        }else{
            System.out.println("Parametri macanti");
        }
    }
}
