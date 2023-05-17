package CipherSuites;

import java.net.InetSocketAddress;
import javax.net.ssl.SSLSocket;
import javax.net.ssl.SSLSocketFactory;

public class SocketFactoryMethod {
    public static void main(String[] args) {
        try {
            SSLSocketFactory obj = (SSLSocketFactory) SSLSocketFactory.getDefault();
            SSLSocket ssl = (SSLSocket) obj.createSocket();

            ssl.connect(new InetSocketAddress("www.youtube.com", 443));
            ssl.getEnabledCipherSuites();
            ssl.getSupportedCipherSuites();
            ssl.getRemoteSocketAddress();

            System.out.println(ssl);

        } catch (Exception e) {
            System.out.println(e);
        }
    }
}
