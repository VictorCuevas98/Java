import java.util.Arrays;
public class NumericArray {
    /**
     * Sort numeric array
     * if the value is 0, take the left value
     * if the value is more than 0, multiply by the left value
     * @param number
     * @return number
     */
    public int [] sortArray(int [] number){
        int [] newArray = Arrays.copyOf(number, number.length);
        for (int i=1; i<number.length; i++){
            newArray[i] = (number[i]>0)? number[i-1] * number[i] : number[i-1];
        }
        return newArray;
    }
}
