package assignment8;

import java.util.Scanner;

public class ExceptionExamples {
    public static void checkException(String exceptionType)throws Exception{
        if(exceptionType.equals("first")){
            throw new FirstExceptionExample();
        }
        else if(exceptionType.equals("second")){
            throw new SecondExceptionExample();
        }
        else if(exceptionType.equals("third"))
        {
            throw new ThirdExceptionExample();
        }
        else
        {
            System.out.println("No exception");
        }
    }
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        String exceptionType=in.nextLine();
        try{
            checkException(exceptionType);
        }
        catch(Exception e){
            System.out.println("Exception "+e+" occurred");
        }
        finally{
            System.out.println("This will be executed even if the Exception occurred");
        }
    }
}
