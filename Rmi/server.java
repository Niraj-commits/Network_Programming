package Rmi;

import java.rmi.*;

public class server {
    public static void main(String[] args) {
        try {
            Adder stub = new RemoteAdder();
            Naming.rebind("rmi://localhost:1234/nist", stub);
        } catch (Exception e) {
            System.out.println(e);
        }
    }
}
