package Lab_Work;

import java.net.*;
import java.io.*;

public class lab_4 {

    public static void main(String[] args) throws Exception {
        URL url = new URL("https://www.example.com/");
        HttpURLConnection conn = (HttpURLConnection) url.openConnection();
        conn.setRequestMethod("GET");

        // Get the cookies from the response
        String cookiesHeader = conn.getHeaderField("Set-Cookie");

        // Store the cookies
        CookieManager cookieManager = new CookieManager();
        cookieManager.getCookieStore().add(null, HttpCookie.parse(cookiesHeader).get(0));

        // Use the cookies in a new request
        URL url2 = new URL("https://www.example.com/somepage");
        HttpURLConnection conn2 = (HttpURLConnection) url2.openConnection();
        conn2.setRequestMethod("GET");
        cookieManager.getCookieStore().getCookies()
                .forEach(cookie -> conn2.addRequestProperty("Cookie", cookie.getName() + "=" + cookie.getValue()));

        // Print the response
        BufferedReader reader = new BufferedReader(new InputStreamReader(conn2.getInputStream()));
        String line;
        while ((line = reader.readLine()) != null) {
            System.out.println(line);
        }
        reader.close();
    }
}
