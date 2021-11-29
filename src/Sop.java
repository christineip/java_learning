import java.util.Scanner;

public class Sop {
    public static void main(String[] args) {
        Scanner scanner1 = new Scanner(System.in);
        System.out.println("Enter Number 1");
        int number1 = scanner1.nextInt();
        Scanner scanner2 = new Scanner(System.in);
        System.out.println("Enter Number 2");
        int number2 = scanner2.nextInt();

        System.out.println("1 - Add");
        System.out.println("2 - Subtract");
        System.out.println("3 - Divide");
        System.out.println("4 - Multiply");
        System.out.println("Choose Operation:");
        Scanner scanner3 = new Scanner(System.in);
        int operation = scanner3.nextInt();

        getResult(number1, number2, operation);
    }


    private static void getResult(int number1, int number2, int operation) {
        switch (operation) {
            case 1:
                System.out.println("Result: " + (number1 + number2));
                break;
            case 2:
                System.out.println("Result: " + (number1 - number2));
                break;
            case 3:
                System.out.println("Result: " + (number1 / number2));
                break;

            case 4:
                System.out.println("Result: " + (number1 * number2));
                break;
            default:
                System.out.println("Invalid operation");
                break;
        }

    }
}
