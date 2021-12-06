import com.chris.learning.Animal;

public class EqualAssignmentStack {
    public static void main(String[] args) {
        Animal dog= new Animal("Anil","domestic");
        Animal dog2= new Animal("Anil","domestic");
        Animal cat=new Animal("Chris", "wild");
        System.out.println(dog==dog2);
        //different location in Heap, thus value different
        System.out.println(dog==cat);

int i=5;
int j=5;
int k=6;


        System.out.println(i==j);
        System.out.println(i==k);

    }



}
