package assignment1;

import java.io.File;
import java.util.Scanner;
import java.util.regex.Pattern;

public class OneDirectorySearch {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        File fileObject=new File("src");
        String files[]=fileObject.list();
        fileObject.listFiles();
        String s=in.next();
        int flag=0;
        for(String file:files){
            if(Pattern.matches(s,file)){
                flag=1;
                System.out.println("file name : "+ file + "path :"+fileObject.getAbsolutePath());
            }
        }
        if(flag==0){
            System.out.println("file not found");
        }
    }
}
