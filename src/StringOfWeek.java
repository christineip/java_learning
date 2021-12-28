import java.util.Arrays;

public class StringOfWeek {
    public static void main(String[] args) {
        String[] week = {"Monday", "Tuesday", "Wednesday", "Thursday", "Friday", "Saturday", "Sunday"};

        System.out.println(LongestWeek(week));
    }

    public static String LongestWeek(String[] week) {
        int longerWeek = 0;
        int index=0;
        for (int i = 0; i < week.length; i++) {
            if (week[i].length()> longerWeek) {
                longerWeek = week[i].length();
                index=i;
            }
        }
        return week[index];
    }

}
