public class Main {
    public static void main(String[] args) {
        int [] array3 = {1,3,3,0,5,6,7,8,0};
        int numberOfCurrentIndex = 0;
        FindCycleSteps cycle = new FindCycleSteps();
        int numberOfSteps = cycle.findSteps(array3, numberOfCurrentIndex);
        //Number of steps to complete an array
        System.out.println("number of steps to complete an array: " + numberOfSteps);
    }
}