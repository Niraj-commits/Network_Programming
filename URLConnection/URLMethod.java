package URLConnection;

import java.net.*;
import java.util.*;

public class URLMethod {

    public static Date getReadableDate(long input) {
        return new Date(input);
    }

    public static void main(String[] args) {
        try {
            URL url = new URL("https://www.google.com");
            URLConnection uc = url.openConnection();
            String cont = uc.getContentType();
            System.out.println(cont);

            int len = uc.getContentLength();
            System.out.println(len);

            long date = uc.getDate();
            System.out.println(getReadableDate(date));

            long modify = uc.getLastModified();
            System.out.println(modify);

            long expire = uc.getExpiration();
            System.out.println(expire);

            Map<String, List<String>> obj = uc.getHeaderFields();
            System.out.println(obj);

        } catch (Exception e) {
            System.out.println(e);
        }
    }
}
