import java.util.ArrayList;

public class PrimerFactor {
    public ArrayList<Integer> primeFactor(int number) {
        int newNumber = number;
        ArrayList<Integer> newArray = new ArrayList<Integer>();
        for (int i = 2; i < 10; i++) {
            System.out.println("after continue " + i);
            if ((newNumber % i) == 0) {
                newNumber /= i;
                newArray.add(i);
                i = 1;
                System.out.println("Before continue " + i);
                continue;

            }
        }
        return newArray;
    }
}