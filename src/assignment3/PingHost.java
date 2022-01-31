package assignment3;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.*;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;

public class PingHost {

    public static long claculateMedian(ArrayList<Long> timeTaken){
        int length= timeTaken.size();
        if(length==0){
            return -1;
        }
        Collections.sort(timeTaken);
        if(length%2==1){
            return timeTaken.get(length/2);
        }
        return (timeTaken.get(length/2)+(timeTaken.get((length/2)-1)))/2;
    }
    public static void commands(ArrayList<String> commandList) throws Exception
    {
        // creating the sub process, execute system command
        ProcessBuilder build = new ProcessBuilder(commandList);
        Process process = build.start();

        // to read the output
        BufferedReader input = new BufferedReader(new InputStreamReader(process.getInputStream()));
        BufferedReader Error = new BufferedReader(new InputStreamReader(process.getErrorStream()));
        String s = null;

        System.out.println("Standard output: ");
        ArrayList<Long> timeTaken=new ArrayList<>();
        while((s = input.readLine()) != null)
        {
            System.out.println(s);
            int index=s.lastIndexOf("time=");
            int spaceIndex=s.lastIndexOf(" ");
            if(index!=-1) {
                spaceIndex=spaceIndex-2;
                index=index+5;
                String time=s.substring(index,spaceIndex);
                timeTaken.add(Long.parseLong(time));
            }
        }
        System.out.println("error (if any): ");
        while((s = Error.readLine()) != null)
        {
            System.out.println(s);
        }
        long median=claculateMedian(timeTaken);
        if(median==-1){
            System.out.println("cant find the median");
        }
        else
        {
            System.out.println("the median time taken is "+median);
        }
    }

    // Driver method
    public static void main(String args[]) throws Exception
    {
        // creating list for commands
        ArrayList<String> commandList = new ArrayList<String>();

        commandList.add("ping");
        // can be replaced by IP
        commandList.add("www.google.com");

        PingHost.commands(commandList);
    }

}
