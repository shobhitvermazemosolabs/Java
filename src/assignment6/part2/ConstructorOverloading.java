package assignment6.part2;

import java.awt.*;
import java.util.Scanner;

public class ConstructorOverloading {
    public ConstructorOverloading(int a, int b){
        System.out.println("the parametrized constructor is called first in the default Constructor and this is the parametrized Constructor");
        System.out.println("the value of a is "+ a + " the value of b is "+b);
    }
    public ConstructorOverloading(){
        Scanner in=new Scanner(System.in);
        int a=in.nextInt();
        int b=in.nextInt();
        new ConstructorOverloading(a,b);
        System.out.println();
        System.out.println("this is the default constructor");
    }

    public static void main(String[] args) {
        ConstructorOverloading obj=new ConstructorOverloading();
    }
}
