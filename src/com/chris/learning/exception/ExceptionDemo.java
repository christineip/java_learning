package com.chris.learning.exception;

public class ExceptionDemo {
    public static void main(String[] args) {
       /* int age = 12;
        try{
           if (age<18){
               throw new InvalidAgeException();
           }
        }
        catch(Exception a){

        }*/


        MyException newException = new MyException();
        newException.myExceptionMethod();
        try {
            newException.myNextExceptionMethod();

        } catch (Exception ex) {
            
        }

    }


}
