public class SwitchExercises {
    public static void main(String[] args) {
        SwitchExercises day = new SwitchExercises();
        //isWeekDay(2);
        System.out.println(day.determineNameOfDay(6));
        System.out.println(isWeekDay(7));
    }

    public static boolean isWeekDay(int dayNumber) {
        switch (dayNumber) {
            case 1:
            case 2:
            case 3:
            case 4:
            case 5:
                return true;
        }
        return false;
    }

    public static String determineNameOfDay(int dayNumber) {
        switch (dayNumber) {
            case 1:
                return "Monday";
            case 2:
                return "Tuesday";
            case 3:
                return "Wednesday";
            case 4:
                return "Thursday";
            case 5:
                return "Friday";
            case 6:
                return "Saturday";
            case 7:
                return "Sunday";
            default:
                return "Invalid day";
        }
    }
}


