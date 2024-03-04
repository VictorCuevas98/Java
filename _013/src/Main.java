import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int num = scanner.nextInt();
        primeNumber(num);
        scanner.close();
    }

    public static ArrayList<Integer> primeFactor (int number){
        int newNumber = number;
        ArrayList<Integer> newArray = new ArrayList<Integer>();
        for (int i = 2; i<10; i++){
            if ((newNumber % i) == 0){
                newNumber /= i;
                newArray.add(i);
                i=1;
                continue;
            }
        }
        return newArray;
    }

    /**
     * returns the smallest prime number that can
     * multiply together to give the number of the param
     */
    public static void primeNumber(int number){
        for (int i=2; i<=number; i++){
            while (number % i == 0){
                System.out.println(i + " ");
                number = number / i;
            }
        }
    }
}