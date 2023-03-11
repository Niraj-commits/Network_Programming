package eventhandling;

import java.io.File;
import java.io.FileReader;
import java.io.BufferedReader;
import java.io.IOException;

public class readfile{
    public static void main(String[] args) {
        File f = new File("Hello.txt");
        try{
            FileReader fr = new FileReader(f);
            BufferedReader bf = new BufferedReader(fr);

            String line;
            while( (line = bf.readLine())!= null){
                System.out.println(line);

            }
            fr.close();
        } 
        catch(IOException e){
            System.out.println("Error" + e);
        }
    }
}