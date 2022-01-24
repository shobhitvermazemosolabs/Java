package assignmet2;

import java.util.*;
public class CheckString {
    public static boolean checkStringSmallCase(String string_to_check){
        for(int index=0;index<string_to_check.length();index++){
            if(!(string_to_check.charAt(index)>=97&&string_to_check.charAt(index)<=122)){
                return false;
            }
        }
        return true;
    }
    public static void main(String[] args) {
        Scanner scannerobject=new Scanner(System.in);
        String string_to_check=scannerobject.nextLine();
        System.out.println(checkStringSmallCase(string_to_check));
    }
}
//the time Complexity for the above checkStringSmallCase function is -> O(n)
//where n is the length of the String that has been provided to be checked
//the space complexity of this function is O(1) as no extra space has been used.
