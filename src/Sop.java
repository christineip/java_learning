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

        int result;
        if (operation == 1) {
            result = number1 + number2;
        } else if (operation == 2) {
            result = number1 - number2;
        } else if (operation == 3) {
            result = number1 / number2;
        } else {
            result = number1 * number2;

        }
        System.out.println("Result :"+result);

    }
}
