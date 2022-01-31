package assignment4;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Scanner;

public class Kyc {
    public static void getDates(String signup,String current, int row_index, String dateArray[][]){
        DateFormat dateFormat=new SimpleDateFormat("dd-mm-yyyy");
        Calendar signupDate=Calendar.getInstance();
        Calendar currentDate=Calendar.getInstance();
        Calendar startDate=Calendar.getInstance();
        signupDate.clear();
        currentDate.clear();
        startDate.clear();

        try{
            signupDate.setTime(dateFormat.parse(signup /*string*/));
            startDate.setTime(dateFormat.parse(signup /*string*/));
            currentDate.setTime(dateFormat.parse(current /*string*/));

            if(currentDate.get(Calendar.YEAR)-signupDate.get(Calendar.YEAR)==0){
                dateArray[row_index][0]="No Range";
            }

            startDate.add(Calendar.YEAR,(currentDate.get(Calendar.YEAR)-signupDate.get(Calendar.YEAR)));
            signupDate.add(Calendar.YEAR,(currentDate.get(Calendar.YEAR)-signupDate.get(Calendar.YEAR)));

            signupDate.add(Calendar.DATE,30);
            startDate.add(Calendar.DATE,-30);

            if(currentDate.after(startDate)&&currentDate.before(signupDate)){
                dateArray[row_index][0]=dateFormat.format(startDate.getTime());
                dateArray[row_index][1]=dateFormat.format(signupDate.getTime());
            }
            else if(currentDate.after(startDate)){
                dateArray[row_index][0]=dateFormat.format(startDate.getTime());
                dateArray[row_index][1]=dateFormat.format(currentDate.getTime());
            }
            else{
                dateArray[row_index][0]="no range";
            }
        } catch (ParseException e) {
            e.printStackTrace();
        }
    }
    public static void main(String[] args) {
        Scanner scannerObject=new Scanner(System.in);
        int inputSize=scannerObject.nextInt();
        String dateArray[][]=new String[inputSize][2];
        System.out.println("Enter the dates that are to be checked");
        for(int row_index=0;row_index<inputSize;row_index++){
            String signup=scannerObject.next();
            String current=scannerObject.next();
            getDates(signup,current,row_index,dateArray);
        }
        for(int row_index=0;row_index<inputSize;row_index++){
            System.out.println(dateArray[row_index][0]);
            if(dateArray[row_index][1]!=null){
                System.out.println(dateArray[row_index][1]);
            }
        }
        scannerObject.close();
        return;
    }
}
