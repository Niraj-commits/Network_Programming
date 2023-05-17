package Socket_Method;

import java.net.*;
import java.util.Scanner;
import java.io.*;

public class server {

    public static void main(String[] args) {
        try {
            Scanner sc = new Scanner(System.in);
            while (true) {
                ServerSocket server = new ServerSocket(1234);
                System.out.println("Server has started");

                Socket client;
                System.out.println("Waiting fot the client to respond.....");
                client = server.accept();
                System.out.println("Connected successfully");

                DataInputStream dis = new DataInputStream(client.getInputStream());

                String input = dis.readUTF();
                System.out.println("Client: " + input);

                String output = sc.nextLine();

                DataOutputStream dos = new DataOutputStream(client.getOutputStream());
                dos.writeUTF(output);
                sc.close();
                server.close();
            }
        } catch (Exception e) {
            System.out.println("Error in server: " + e.getMessage());
        }

    }
}
