public class Main {
    public static void main (String [] args){
        NumericArray array = new NumericArray();
        int [] randomArray = new int[] {1,2,3,4,5,0};
        int [] numericArray = array.sortArray(randomArray);
        for (int num : numericArray){
            System.out.println(num);
        }
    }
}
