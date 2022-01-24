package corejavacode;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.InputMismatchException;
import java.util.Scanner;

public class FileInputFun {
    public static void main(String[] args) {
        Scanner infile;
        try{
            infile=new Scanner(new File("input.txt"));
            int input;
            int sum=0;
            while(infile.hasNext()){
                input=infile.nextInt();
                sum+=input;
                System.out.println(input);
            }//end while
            System.out.println("sum of all numbers is "+sum);
            infile.close();
        }
        catch(FileNotFoundException ex){
            System.out.println("can't find file");
            System.out.println(ex.getMessage());
        }
        catch(InputMismatchException ex){
            System.out.println("error loading input!");
        }
    }
}
