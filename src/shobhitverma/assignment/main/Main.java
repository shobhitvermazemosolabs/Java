package shobhitverma.assignment.main;

import shobhitverma.assignment.data.DefaultInitializationAssignment1;
import shobhitverma.assignment.singleton.Singleton;

public class Main {
    public static void main(String[] args) {
        Singleton singletonObject=new Singleton();
        singletonObject.printStringVariable();
        /*
        singletonObject.getInstance();
        This part of the code is commented for the program to run as this method contains some
        errors due to which
         */
        DefaultInitializationAssignment1 object=new DefaultInitializationAssignment1();
        object.printInstanceVariables();
        /*
        object.printLocalVariable();
        this is the part of part1 class which contains the error
         */
    }
}
