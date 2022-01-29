package shobhitverma.assignment.singleton;

import java.util.Scanner;

public class Singleton {
    String stringVariable;

    /*
    public static Singleton getInstance(String input){
        stringVariable=input;
        return new Singleton();

        This function of the code gives us an error at line 10 because we are referencing a
        non-static variable from a static context. This happens because the static context is
        available throughout the code whereas non-static context is not. A non-static context can
        only be referenced using a object only but static can be used without an object as well.
    }
    */

    public void printStringVariable(){
        System.out.println("The String Variable is "+stringVariable+ ".");
    }

    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        String input=in.nextLine();
//        Singleton object=getInstance(input);
    }
}
