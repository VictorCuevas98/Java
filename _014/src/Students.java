import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class Students {
    private String name;
    private String grade;

    public Students (String name, String grade){
        setName(name);
        setGrade(grade);
    }

    public Students (){
        setName("");
        setGrade("");
    }
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getGrade() {
        return grade;
    }

    public void setGrade(String grade) {
        this.grade = grade;
    }
    //public Students [] getUniqueStudents(Students [] students){

    //}
    public Students getBestAverageGrade (Students [] students){
        Students greatness = new Students(students[0].name, students[0].grade);
        for (int i = 0; i<students.length-1; i++){
            if (Integer.parseInt(greatness.grade) > Integer.parseInt(students[i+1].grade))
                greatness = new Students(greatness.name, greatness.grade);
            else
                greatness = new Students(students[i+1].name, students[i+1].grade);
        }
        return greatness;
    }

    public String findBestAverage(String[][] students){
        Map<String, Integer> studentSums = new HashMap<>();
        Map<String, Integer> studentCounts = new HashMap<>();

        for(String[] student : students){
            String name = student[0];
            int grade = Integer.parseInt(student[1]);
            // grade 10
            // grade 7
            studentSums.put(name, studentSums.getOrDefault(name,0) + grade);
            // victor, 0 + 10
            // victor, 10 + 7

            studentCounts.put(name, studentCounts.getOrDefault(name, 0) + 1);
            // victor, 0 + 1
            // victor, 1 + 1 cannot be duplicates keys
        }

        String bestStudent = "";
        double bestAverage = Double.MIN_VALUE;

        for (Map.Entry<String, Integer> entry : studentSums.entrySet()){
            String name = entry.getKey();
            int totalGrade = entry.getValue();
            int count = studentCounts.get(name);
            double average = (double) totalGrade / count;

            if (average > bestAverage){
                bestAverage = average;
                bestStudent = name;
            }
        }
        return bestStudent + " " + bestAverage;
    }
}