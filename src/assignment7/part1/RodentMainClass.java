package assignment7.part1;

import assignment7.part1.Gerbils;
import assignment7.part1.Hamster;
import assignment7.part1.Mouse;
import assignment7.part1.Rodent;

import java.util.Scanner;

public class RodentMainClass {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        System.out.println("enter the number of Rodents to be stored");
        int rodentNum=in.nextInt();
        Rodent rodentArray[]=new Rodent[rodentNum];
        for(int index=0;index<rodentNum;index++){
            System.out.println("enter the type of rodent");
            String rodentType=in.next();
            if(rodentType.equalsIgnoreCase("mouse")){
                rodentArray[index]=new Mouse();
            }
            else if(rodentType.equalsIgnoreCase("gerbils")){
                rodentArray[index]=new Gerbils();
            }
            else if(rodentType.equalsIgnoreCase("Hamster")){
                rodentArray[index]=new Hamster();
            }
        }
        for(int index=0;index<rodentNum;index++){
            rodentArray[index].rodentColor();
        }
    }
}
