package assignment11;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.HashMap;
import java.util.Scanner;
import java.util.Set;

public class CountCharacters {
    public static void main(String[] args) {
        Scanner infile;
        try{
            infile=new Scanner(new File("input.txt"));
            String word;
            HashMap<Character,Integer> map=new HashMap<>();
            while(infile.hasNext()){
                word=infile.nextLine();
                for(int index=0;index<word.length();index++) {
                    if (map.containsKey(word.charAt(index))) {
                        map.put(word.charAt(index), map.get(word.charAt(index)) + 1);
                    } else {
                        map.put(word.charAt(index), 1);
                    }
                }
            }
            PrintWriter pw=new PrintWriter("outputCountCharacters.txt");
            Set<Character> characterSet;
            characterSet = map.keySet();
            for(char character:characterSet){
//                System.out.println(character+" "+map.get(character));
                if(character!=' ') {
                    pw.println(character + " " + map.get(character));
                }
            }
            pw.close();
            infile.close();
        }
        catch(FileNotFoundException ex){
            ex.getMessage();
        }
    }
}
