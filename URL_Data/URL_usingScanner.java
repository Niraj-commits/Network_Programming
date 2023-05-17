package URL_Data;

import java.net.*;
import java.io.*;
import java.util.Scanner;

class URLUtilities {
    public static String getData(String url_input) throws Exception {
        URL url = new URL(url_input);
        URLConnection uc = url.openConnection();
        BufferedReader br = new BufferedReader(new InputStreamReader(uc.getInputStream()));

        String data = "";
        String line;
        while ((line = br.readLine()) != null) {
            data += line;
        }
        return data;
    }

    public static int writeTofile(String text, String path) throws Exception {
        FileOutputStream writeFile = new FileOutputStream(path);
        byte writeByte[] = text.getBytes();
        writeFile.write(writeByte);
        writeFile.close();
        return 0;
    }

}

public class URL_usingScanner {

    public static void main(String[] args) {

        try {
            Scanner sc = new Scanner(System.in);
            System.out.println("Enter the URL");
            String outputUrl = sc.nextLine();
            String content = URLUtilities.getData(outputUrl);
            URLUtilities.writeTofile(content, "index.html");
            sc.close();
        } catch (Exception e) {
            System.out.println(e);
        }
    }
}