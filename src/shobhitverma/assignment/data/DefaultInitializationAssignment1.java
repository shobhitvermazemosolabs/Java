package shobhitverma.assignment.data;

public class DefaultInitializationAssignment1 {
    int classIntegerVariable;
    char classCharacterVariable;
    public void printInstanceVariables(){
        System.out.println("default integer value is "+classIntegerVariable);
        System.out.println("default character value is "+classCharacterVariable);
    }
    /*
    public void printLocalVariables(){
        int localIntegerVariable;
        char localCharacterVariable;
        System.out.println("integer value is "+localIntegerVariable);
        System.out.println("character value is "+localCharacterVariable);

        This code throws an error because the local variables are not initialized.
        This error happens because when the class variables are defined they can take the default
        values, but in the case of local variables this is forbidden because when programmer defines
        a local variable it is for a particular operation so in that case if the default values are
        used that can create a lot of problems. So the compiler make it compulsory for programmers
        to initialize it with some values before they access the variable to avoid the usage of undefined values.
    }
    */
}
