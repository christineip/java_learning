package animal_interface;

public class Duck implements Animal{
    @Override
    public String Sound() {
        return "Quack quack";
    }

    @Override
    public String toString() {
        return super.toString();
    }
}
