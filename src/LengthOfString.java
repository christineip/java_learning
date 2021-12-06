public class LengthOfString {
    public static void main(String[] args) {
        String someString = "There is a lot of text again";
        System.out.println(someString);
        someString.length();
   System.out.println(someString.length());
   //length is 28
   System.out.println(someString.charAt(27));
   //count from 0 - 27 inclusive


        for(int i=0;i <someString.length(); i++){
            System.out.println(someString.charAt(i));

        }
    }
}
