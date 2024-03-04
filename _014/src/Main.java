import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {

//  1st try
//        Scanner scanner = new Scanner(System.in);
//        Students [] array = new Students[4];
//        array[0] = new Students(scanner.next(), scanner.next());
//        array[1] = new Students(scanner.next(), scanner.next());
//        array[2] = new Students(scanner.next(), scanner.next());
//        array[3] = new Students(scanner.next(), scanner.next());
//
//        Students bestAverageGrade = new Students();
//        bestAverageGrade = bestAverageGrade.getBestAverageGrade(array);
//        System.out.println("Name: " + bestAverageGrade.getName() + "\n" +
//                            "Grade: " + bestAverageGrade.getGrade());


        String[][] students = {
                { "Boddy", "87"},
                {"Charles","100"},
                {"Eric","64"},
                {"Charles","22"}};

        Students student = new Students();
        System.out.println(student.findBestAverage(students));

//        String another = "This is a message";
//        OccurrencesInString object = new OccurrencesInString();
//        HashMap<String, Integer> occurrences = object.occurrencesInString(another);
//
//        System.out.println("Occurrences: ");
//        for (Map.Entry<String, Integer> entry : occurrences.entrySet()){
//            System.out.println(entry.getKey());
//            System.out.println(entry.getValue());
//        }
    }
}