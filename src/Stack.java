public class Stack {

    int id;
    String name;

    Stack(int id, String name) {
        this.id = id;
        this.name = name;
    }

    @Override
    public String toString() {
        return "Stack{" +
                "id=" + id +
                ", name='" + name + '\'' +
                '}';
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public static void main(String[] args) {
        Stack stack1 = new Stack(111, "Chris");

        //object: new Stack();
        //reference: Stack stack1
        Stack stack2 = new Stack(222, "Anil");
        //only reference is created
        Stack stack3;
        stack3 = stack1;

        System.out.println(stack3);

        System.out.println(stack3);


        stack2.setId(333);
        stack2.setName("anonymous");
        // or   stack2=stack1;

        System.out.println(stack2);
        System.out.println(stack3);
    }


}
