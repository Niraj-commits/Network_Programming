package UDP_Methods;

import java.net.*;

public class udp_server {
    public static void main(String[] args) throws Exception {
        int serverPort = 12345;

        DatagramSocket serverSocket = new DatagramSocket(serverPort);
        serverSocket.setSoTimeout(0); // Disable timeout
        serverSocket.setSendBufferSize(1024); // Set the send buffer size to 1KB
        serverSocket.setReceiveBufferSize(1024); // Set the receive buffer size to 1KB

        byte[] receiveData = new byte[1024];
        DatagramPacket receivePacket = new DatagramPacket(receiveData, receiveData.length);
        serverSocket.receive(receivePacket);

        String message = new String(receivePacket.getData(), 0, receivePacket.getLength());
        System.out.println("Received message from client: " + message);

        InetAddress clientAddress = receivePacket.getAddress();
        int clientPort = receivePacket.getPort();
        String response = "Hello, client!";
        byte[] sendData = response.getBytes();
        DatagramPacket sendPacket = new DatagramPacket(sendData, sendData.length, clientAddress, clientPort);
        serverSocket.send(sendPacket);

        serverSocket.close();
    }
}
