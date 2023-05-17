package Threads;

import java.net.*;
import java.io.*;
import java.util.Scanner;

public class client {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        try {
            Socket client = new Socket("localhost", 8001);

            while (true) {
                System.out.println("Enter Text: ");
                String Output = sc.nextLine();

                DataOutputStream dos = new DataOutputStream(client.getOutputStream());
                dos.writeUTF(Output);

                DataInputStream dis = new DataInputStream(client.getInputStream());
                String input = dis.readUTF();
                System.out.println("Server is Saying: " + input);
                sc.close();
                client.close();
            }
        } catch (Exception e) {
            System.out.println("Error" + e.getMessage());
        }
    }
}
