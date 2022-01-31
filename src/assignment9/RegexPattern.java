package assignment9;

import java.util.Scanner;
import java.util.regex.*;

public class RegexPattern {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        String input=in.nextLine();
        String pattern="[A-Z]+[a-zA-Z0-9._ ]*[.]+";
        boolean check= Pattern.matches(pattern,input);
        if(check){
            System.out.println("pattern is matched");
            return;
        }
        System.out.println("pattern does not match");
        in.close();
    }
}
