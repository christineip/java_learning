import java.lang.reflect.Array;

public class StudentRunner {
    public static void main(String[] args) {
        int[] marks = {20, 30, 40};
        Student student = new Student("Christine", marks);
        int number = student.getNumberOfMarks(marks);
        System.out.println("number of marks: "+ number);
        int totalSum = student.getTotalSumOfMarks(marks);
        System.out.println("total sum of marks: "+totalSum);
        int maxMark= student.getMaximumMark(marks);
        System.out.println("maximum of mark: "+maxMark);
        int minMark=student.getMiniumMark(marks);
        System.out.println("minimum of mark: "+minMark);
        int averageMark=student.getAverageMark(marks);
        System.out.println("average of mark: "+averageMark);
    }
}
