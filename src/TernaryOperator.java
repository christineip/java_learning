public class TernaryOperator {
    public static void main(String[] args) {


        System.out.println(printColour(1));
        System.out.println(printColourTernary(1));


    }

    public static boolean printColour(int colour) {
        if (colour == 1) {
            return true;

        } else {
            return false;
        }


    }

    public static boolean printColourTernary(int colour) {
        return colour == 1 ? true : false;


    }

}
