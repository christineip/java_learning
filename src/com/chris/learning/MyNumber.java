package com.chris.learning;

public class MyNumber {

    int number;

    public MyNumber(int number) {
        this.number = number;
    }

    public boolean isPrime() {
        if (number < 2) {
            return false;
        }
        ;


        for (int i = 2; i < number; i++) {
            if (number % i == 0)
                return false;

        }
        return true;
    }

    public int sumUptoN() {
        int sum = 0;
        for (int i = 0; i <= number; i++) {
            sum = i + sum;
        }
        return sum;
    }

    public int sumOfDivisor() {
        int sum = 0;
        for (int i = 2; i <= number - 1; i++) {
            if (number % i == 0) {
                sum = i + sum;
            }
        }
        return sum;
    }

    public void printANumberTriangle()
    {
        for(int i=1; i<=number;i++){
          for (int count=1; count<=i; count++) {
              System.out.print(count + " ");
          }System.out.println();
        }
    }
}
