import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int [] array1 = new int[2];
        int [] array2 = new int[2];
        int [] result = new int[2];

        //setter
        for (int i = 0; i<array1.length; i++)
            array1[i] = s.nextInt();

        for (int i = 0; i<array1.length; i++)
            array2[i] = s.nextInt();

        Fractions newFraction = new Fractions();
        result = newFraction.addFraction(array1, array2);
        System.out.println(result[0] + "/" + result[1]);
    }
}