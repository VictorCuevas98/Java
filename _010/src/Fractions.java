import java.lang.ArithmeticException;
public class Fractions {
    private int numerator;
    private int denominator;
    public int getNumerator() {
        return numerator;
    }

    public void setNumerator(int numerator) {
        this.numerator = numerator;
    }

    public int getDenominator() {
        return denominator;
    }

    public void setDenominator(int denominator) {
        this.denominator = denominator;
    }

    /**
     * 3/9 2/7
     * @param arr1
     * @param arr2
     * @return
     */
    public int[] addFraction(int[] arr1, int[] arr2){
        int newNumerator;
        int newDenominator;

        try{
            int test = arr1[0]/arr1[1];
            int test2 = arr2[0]/arr2[1];
            if (arr1[1] == arr2[1]) {
                newNumerator = arr1[0] + arr2[0];
                newDenominator = arr1[1];
            } else {
                newDenominator = arr1[1] * arr2[1];
                newNumerator = (arr1[0] * arr2[1]) + (arr1[1] * arr2[0]);
            }
            setNumerator(newNumerator);
            setDenominator(newDenominator);
            factorizing();
            return new int[] {getNumerator(), getDenominator()};
        }catch (ArithmeticException e){
            throw new ArithmeticException("Denominator cannot be 0");
        }
    }

    public void factorizing(){

        for (int i = 2; i<10; i++){
            if ( ( (this.numerator % i) == 0) && (this.denominator % i) == 0){
                this.numerator /= i;
                this.denominator /= i;
                i=2;
                continue;
            }
        }
    }
}
