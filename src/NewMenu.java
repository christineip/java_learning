import java.util.Scanner;

public class NewMenu {
    public static void main(String[] args) {

        Scanner scanner1 = new Scanner(System.in);
        System.out.println("Input a number 1");
        int number1 = scanner1.nextInt();

        Scanner scanner2 = new Scanner(System.in);
        System.out.println("Input a number 2");
        int number2 = scanner2.nextInt();


        System.out.println("1 - Add");
        System.out.println("2 - Subtract");
        System.out.println("3 - Divide");
        System.out.println("4 - Multiply");
        System.out.println("Choose Operation:");
        Scanner scanner3 = new Scanner(System.in);

        int number3 = scanner3.nextInt();
        System.out.println(calculator(number1, number2, number3));
    }


    public static int calculator(int number1, int number2, int number3) {
        int result = 0;
        switch (number3) {
            case 1:

                result = number1 + number2;
                break;

            case 2:
                result = number1 - number2;
                break;

            case 3:
                result = number1 * number2;
                break;

            case 4:
                result = number1 / number2;
                break;
            default:
                break;

        }
        return result;

    }
}
