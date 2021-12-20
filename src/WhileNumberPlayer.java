public class WhileNumberPlayer {
    int numberOfPlayer;

    public WhileNumberPlayer(int numberOfPlayer) {
        this.numberOfPlayer = numberOfPlayer;
    }


    public  void printSquareUpToLimit() {

        int i = 1;

        while (i < numberOfPlayer) {
            int result;
            result = i * i;
            if (result <= numberOfPlayer) {
                System.out.print(result + " ");
            }
            i++;
        }

    }

    public void printCubesUpToLimit() {
        int j = 1;
        int k = 1;
        while (j * j * j < numberOfPlayer) {
            System.out.print(j * j * j + " ");

            j++;
        }
    }

}
