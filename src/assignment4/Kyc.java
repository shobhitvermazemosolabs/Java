package assignment4;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Scanner;

public class Kyc {
    public static void getDates(String signup,String current, int row_index){
        DateFormat dateFormat=new SimpleDateFormat("dd-mm-yyyy");
        Calendar signupDate=Calendar.getInstance();
        Calendar currentDate=Calendar.getInstance();
        Calendar systemDate=Calendar.getInstance();
        signupDate.clear();
        currentDate.clear();
        systemDate.clear();
    }
    public static void main(String[] args) {
        Scanner scannerObject=new Scanner(System.in);
        int inputSize=scannerObject.nextInt();
        String dateArray[][]=new String[inputSize][2];
        System.out.println("Enter the dates that are to be checked");
        for(int row_index=0;row_index<inputSize;row_index++){
            String signup=scannerObject.next();
            String current=scannerObject.next();
            getDates(signup,current,row_index);
        }

    }
}
