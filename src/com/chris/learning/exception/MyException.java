package com.chris.learning.exception;

public class MyException {
   void myExceptionMethod(){
        try{
            throw new Exception();

        }
        catch(Exception m){

        }
    }

    void myNextExceptionMethod() throws Exception{
       /*throws Exception: ask the caller of the myNextExceptionsMethod to handle the Exception, below either one should be done in the
       caller method
       1. caller method should throws Exception as well, to escape from the catching at the moment
       2. try to catch the Exception in the Caller
        */

       throw new Exception();




    }
}
