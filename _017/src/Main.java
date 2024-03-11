import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Robot alexa = new Robot(0,0);
        Scanner s = new Scanner(System.in);

        goShopping(s.next(), alexa);
        System.out.println(alexa.getX() + ", " + alexa.getY());
    }

    public static void goShopping(String movements, Robot alexa){
        for (int i = 0; i < movements.length(); i++){
            int y = alexa.getY();
            int x = alexa.getX();
            switch (movements.charAt(i)){

                case 'U':
                    alexa.setY(y + 1);
                    break;
                case 'D':
                    alexa.setY(y - 1);
                    break;
                case 'L':
                    alexa.setX(x - 1);
                    break;
                case 'R':
                    alexa.setX(x + 1);
                    break;
                default:
                    System.out.println("No instruction is written");
                    break;
            }
        }
    }
}