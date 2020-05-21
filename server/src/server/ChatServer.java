package server;

import network.TCPConnection;
import network.TCPConnectionListener;

import java.io.IOException;
import java.net.ServerSocket;
import java.util.ArrayList;

public class ChatServer implements TCPConnectionListener {
    public static void main(String[] args) {
        new ChatServer();
    }

    private final ArrayList< TCPConnection > connections = new ArrayList<>();

    private ChatServer() {
        System.out.println("Сервер працює ");
        try (ServerSocket serverSocket = new ServerSocket(8189)) {
            while (true) {
                try {
                    new TCPConnection(this, serverSocket.accept());
                } catch (IOException e) {
                    System.out.println("TCPConnection виключення: " + e);
                }
            }
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    @Override
    public synchronized void onConnectionReady(TCPConnection tcpConnection) {
        connections.add(tcpConnection);
        sendAllConnection("Підключився :  "+tcpConnection);
    }

    @Override
    public synchronized void onConnectionString(TCPConnection tcpConnection, String value) {
sendAllConnection(value);
    }

    @Override
    public synchronized void onDisconnect(TCPConnection tcpConnection) {
        connections.remove(tcpConnection);
        sendAllConnection("Відключився :  "+tcpConnection);
    }

    @Override
    public synchronized void onException(TCPConnection tcpConnection, Exception e) {
        System.out.println("TCPConnection виключення: " + e);
    }

    private void sendAllConnection(String value) {
        System.out.println(value);
        final int cnt = connections.size();
        for (int i = 0; i < cnt; i++) {
            connections.get(i).sendString(value);
        }
    }
}
