package InetAddressing.Inet;

import java.net.*;
import java.io.IOException;

public class ByName {
    public static void main(String[] args){

        try{
        InetAddress host =  InetAddress.getByName("www.youtube.com");
        System.out.println("Your local host is " + host);

        System.out.println("The ip of youtube is " + host.getHostAddress());

        InetAddress localAdd = InetAddress.getLocalHost();
        System.out.println("The ip of your pc is " +localAdd.getHostAddress());
        
        
    }
    catch (IOException e){
        System.out.println("Error");
    }
}
}