public class Main {

    public static boolean isPowerOfTen(int number){
        if (number == 1)
            return true;
        if (number < 0)
            return false;
        //iterate number of digits
        int numberOfDigits = String.valueOf(number).length();
        if (numberOfDigits == 1)
            return false;
        float newNumber = number;
        for (int i = 0; i < numberOfDigits-1; i++){
            if ((number % 1) != 0){
                newNumber = newNumber * 10;
            }else{
                newNumber = newNumber / 10;
            }
        }
        System.out.println("new number: " + newNumber);
        return newNumber == 1;
    }

    public static void main(String[] args) {
        boolean value = isPowerOfTen(1000);
        System.out.println("Value: " + value);
    }
}