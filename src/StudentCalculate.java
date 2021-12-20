import java.util.Arrays;
import java.util.OptionalInt;

class Student {
    private String name;
    private int[] marks;

    public Student(String name, int[] marks) {
        this.name = name;
        this.marks = marks;
    }

    public int getNumberOfMarks(int[] marks) {
        return marks.length;
    }

    public static int getTotalSumOfMarks(int[] marks) {
        int sum = 0;
        for (int i = 0; i < marks.length; i++) {
            sum = sum + marks[i];
        }
        return sum;
    }

    public int getMaximumMark(int[] marks) {

        int max = marks[0];
        for (int i = 1; i < marks.length; i++) {
            if (marks[i] > max)
                max = marks[i];
        }
        return max;
    }

    public int getMiniumMark(int[] marks) {
        int min = marks[0];
        for (int i = 1; i < marks.length; i++) {
            if (marks[i] < min)
                min = marks[i];
        }
        return min;
    }

    public int getAverageMark(int[] marks) {
        int average = Student.getTotalSumOfMarks(marks) / marks.length;
        return average;

    }

}
