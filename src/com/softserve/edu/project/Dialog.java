package com.softserve.edu.project;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;


public class Dialog extends JFrame {
    public static final int FRAME_WIDTH = 350;
    public static final int FRAME_HEIGHT = 200;
    private Test test = new Test();
    private String[] arr = {"red","blue","bleak"};
    JFrame frame = new JFrame();
    JTabbedPane tabby = new JTabbedPane();

    public JPanel getPanel() {
        return panel;
    }

    private JTextArea jTextArea=new JTextArea(5,30);
    private JLabel jLabel = new JLabel("my text");
    private JTextField output = new JTextField("", 5);
    private JButton button = new JButton("button");
    private JButton buttonExit = new JButton("Exit");
    private JCheckBox checkBox = new JCheckBox("checkBox");
    private JRadioButton radioButton = new JRadioButton("radioButton");
    private JRadioButton radioButton2 = new JRadioButton("radioButton 2");
    private JPanel panel = new JPanel(new GridLayout(3, 3, 5, 5));
    private JPanel panel2 = new JPanel(new GridLayout(3, 3, 5, 5));
    private JComboBox comboBox= new JComboBox(test.getArray());
    private JScrollBar jScrollBar= new JScrollBar();


    public Dialog() {
        super("name project");
        this.setBounds(300, 300, 800, 500);
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        panel.add(jLabel);
        panel.add(output);
        panel.add(button);
        panel.add(checkBox);
        ButtonGroup buttonGroup= new ButtonGroup();
        buttonGroup.add(radioButton);
        buttonGroup.add(radioButton2);
        panel.add(radioButton);
        panel.add(radioButton2);
        panel.add(comboBox);
        panel.add(jTextArea);
        panel.add(buttonExit);
        panel2.add(jLabel);

        tabby.addTab("first",panel);
        tabby.addTab("Second",panel2);

        frame.setTitle("Test Tabbed Pane");
        frame.setSize(FRAME_WIDTH, FRAME_HEIGHT);

        frame.add(tabby);

        Container container = this.getContentPane();
        container.add(panel, BorderLayout.CENTER);


        buttonExit.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                setVisible(false);
                System.exit(0);
            }
        });
        button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String message=output.getText();
                JOptionPane.showMessageDialog(null,message+" "+comboBox.getSelectedItem(),"out",JOptionPane.PLAIN_MESSAGE);

            }
        });
    }
}
