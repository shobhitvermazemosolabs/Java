package corejavacode;

import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.ArrayList;

public class WriteNames {
    public static void main(String[] args) {
        try {
            PrintWriter pw = new PrintWriter("outputWriteNames.txt");
            ArrayList<String> names=new ArrayList<>();
            names.add("John");
            names.add("Cally");
            names.add("Som");
            names.add("Tarik");
            names.add("Sen");
            for(String name:names){
                pw.println(name);
            }
            pw.close();
        }
        catch(FileNotFoundException ex){
            System.out.println("could ot able to write the file");
        }
    }
}
