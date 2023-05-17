package UDP_Methods;

import java.net.*;

public class udp_client {
    public static void main(String[] args) throws Exception {
        String message = "Hello, server!";
        InetAddress serverAddress = InetAddress.getLocalHost();
        int serverPort = 12345;

        DatagramSocket clientSocket = new DatagramSocket();
        clientSocket.setSoTimeout(5000);
        clientSocket.setSendBufferSize(1024);
        clientSocket.setReceiveBufferSize(1024);
        byte[] sendData = message.getBytes();
        DatagramPacket sendPacket = new DatagramPacket(sendData, sendData.length, serverAddress, serverPort);
        clientSocket.send(sendPacket);

        byte[] receiveData = new byte[1024];
        DatagramPacket receivePacket = new DatagramPacket(receiveData, receiveData.length);
        clientSocket.receive(receivePacket);

        String response = new String(receivePacket.getData(), 0, receivePacket.getLength());
        System.out.println("Server response: " + response);

        clientSocket.close();
    }
}
