package URLConnection;

import java.net.*;
import java.util.*;

public class URLConn {
    public static void main(String[] args) {

        try {
            URL url = new URL("https://www.youtube.com");
            URLConnection conn = url.openConnection();
            Map<String, List<String>> mapObject = conn.getHeaderFields();

            System.out.println(mapObject);
        } catch (Exception e) {
            System.out.println(e);
        }
    }
}