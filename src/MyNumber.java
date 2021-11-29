public class MyNumber {
    public static void main(String[] args) {
        MyNumber number = new MyNumber();
        System.out.println(number.isPrime(9));

    }

    public static boolean isPrime(int number) {
        if (number % 2 == 0)
            return false;
        else return true;
    }


}
