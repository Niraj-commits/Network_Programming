package eventhandling;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class writefile {
    public static void main(String[] args){

        File myFile = new File("Hello.txt");

        try{
            FileWriter file = new FileWriter(myFile);
            file.write("here are content");
            file.close();
        }
        catch(IOException e){
            System.out.println("Error has occured");
        }
    }
}
