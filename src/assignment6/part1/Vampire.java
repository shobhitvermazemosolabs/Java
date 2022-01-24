package assignment6.part1;
import java.util.Arrays;


public class Vampire
{
    final static int START = 11, END = 1000;
    public static void main(String[] args)
    {
        char[] kChar, checkChar;
        String kStr, checkStr;
        int k;
        int count=0;
        for(int i=START; i<END; i++) {
            String start=String.valueOf(i);
            int max=(int)Math.min(END,Math.pow(10,start.length()));
            for(int i1=i; i1<max; i1++) {

                k = i * i1;

                kStr = Integer.toString(k);
                checkStr = Integer.toString(i) + Integer.toString(i1);



                kChar = kStr.toCharArray();
                checkChar = checkStr.toCharArray();

                Arrays.sort(kChar);
                Arrays.sort(checkChar);

                if(Arrays.equals(kChar, checkChar) && count<100) {
                    count++;
                    System.out.println(i + " * " + i1 + " = " + k);
                }
            }
        }
    }
}