package URL_Data;

import java.net.*;
import java.io.*;

class DataFromURL {
    public static void main(String[] args) {
        try {
            URL url = new URL("https://www.youtube.com");
            URLConnection uc = url.openConnection();

            BufferedReader br = new BufferedReader(new InputStreamReader(uc.getInputStream()));
            String line;
            while ((line = br.readLine()) != null) {
                System.out.println(line + "\n");
            }
        } catch (Exception e) {
            System.out.println("Error");
        }
    }
}