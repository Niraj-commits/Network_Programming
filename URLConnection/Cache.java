package URLConnection;

import java.net.*;

public class Cache {

    public static void main(String[] args) {

        try {
            URL url = new URL("https://www.youtube.com");
            URLConnection uc = url.openConnection();
            uc.setDoInput(true); // allows uc.getInputStream;
            uc.setDoInput(false); // restricts uc.getInputStream;
            uc.setDoOutput(true); // allows uc.getOutputStream;
            uc.setDoOutput(false); // restricts uc.getOutputStream;
        } catch (Exception e) {
            System.out.println(e);
        }
    }
}
