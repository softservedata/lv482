package client;

import network.TCPConnection;
import network.TCPConnectionListener;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.IOException;

public class ClientWindow extends JFrame implements ActionListener, TCPConnectionListener {
    public static final String IP_ADDR = "192.168.1.194";
    public static final int PORT = 8189;
    public static final int WIDTH = 600;
    public static final int HEIGHT = 400;

    public static void main(String[] args) {
        SwingUtilities.invokeLater(ClientWindow::new);
    }

    private final JTextArea log = new JTextArea();
    private final JTextField fieldNickname = new JTextField("Роман");
    private final JTextField fieldInput = new JTextField();

    private TCPConnection connection;

    private ClientWindow() {
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        setSize(WIDTH, HEIGHT);
        setLocationRelativeTo(null);
        setAlwaysOnTop(true);
        log.setEditable(false);
        log.setLineWrap(true);
        add(log, BorderLayout.CENTER);

        fieldInput.addActionListener(this);

        add(fieldInput, BorderLayout.SOUTH);
        add(fieldNickname, BorderLayout.NORTH);


        setVisible(true);
        try {
            connection = new TCPConnection(this, IP_ADDR, PORT);
        } catch (IOException e) {
            e.printStackTrace();
            printmsg("Виключення підключення" + e);
        }
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        String msg = fieldInput.getText();
        if(msg.equals("")) return;
        fieldInput.setText(null);
        connection.sendString(fieldNickname.getText() + ": " + msg);

    }

    @Override
    public void onConnectionReady(TCPConnection tcpConnection) {
        printmsg("з'єднання готове");
    }

    @Override
    public void onConnectionString(TCPConnection tcpConnection, String value) {
        printmsg(value);
    }

    @Override
    public void onDisconnect(TCPConnection tcpConnection) {
        printmsg("з'єднання розірване");
    }

    @Override
    public void onException(TCPConnection tcpConnection, Exception e) {
        printmsg("Виключення підключення" + e);
    }

    private synchronized void printmsg(String msg) {
        SwingUtilities.invokeLater(() -> {
            log.append(msg + "\n");
            log.setCaretPosition(log.getDocument().getLength());
        });
    }
}
